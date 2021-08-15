package com.xm.admin.module.sys.controller;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xm.admin.config.exception.SkeletonException;
import com.xm.admin.module.sys.dto.RoleAddEditRequest;
import com.xm.admin.module.sys.entity.SysRole;
import com.xm.admin.module.sys.entity.SysRolePermission;
import com.xm.admin.module.sys.service.ISysRolePermissionService;
import com.xm.admin.module.sys.service.ISysRoleService;
import com.xm.common.enums.ResultCodeEnums;
import com.xm.common.utils.CommonPageUtil;
import com.xm.common.utils.ResultUtil;
import com.xm.common.vo.ExtraVo;
import com.xm.common.vo.Result;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 角色表 前端控制器
 * </p>
 *
 * @author xiaomalover <xiaomalover@gmail.com>
 * @since 2021-08-08
 */
@RestController
@RequestMapping("/skeleton/role")
public class SysRoleController {

    private final ISysRoleService roleService;

    private final ISysRolePermissionService rolePermissionService;

    public SysRoleController(ISysRoleService roleService, ISysRolePermissionService rolePermissionService) {
        this.roleService = roleService;
        this.rolePermissionService = rolePermissionService;
    }

    @GetMapping("/getRoleList")
    public Result<Object> getRoleList(
            @ModelAttribute ExtraVo extraVo,
            @RequestParam(required = false) String roleNme,
            @RequestParam(required = false) Integer status
    ) {
        IPage<SysRole> page = new CommonPageUtil<SysRole>().initIPage(extraVo);

        Map<String, Object> conditionMap = new HashMap<>(8);

        if (StrUtil.isNotBlank(roleNme)) {
            conditionMap.put("roleNme", roleNme.trim());
        }

        if (ObjectUtil.isNotNull(status)) {
            conditionMap.put("status", status);
        }

        IPage<SysRole> roleList = roleService.getRoleList(page, extraVo, conditionMap);

        return new ResultUtil<>().success(roleList);
    }

    @GetMapping("/getAllRoleList")
    public Result<Object> getAllRoleList() {
        List<SysRole> roleList = roleService.getAllRoleList();
        return new ResultUtil<>().success(roleList);
    }

    @PostMapping("/add")
    @Transactional(rollbackFor = Exception.class)
    public Result<Object> add(@Valid RoleAddEditRequest roleAddEditRequest) {
        //查询用户是否已存在
        QueryWrapper<SysRole> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(SysRole::getCode, roleAddEditRequest.getRoleValue());
        int exist = roleService.count(queryWrapper);
        if (exist > 0) {
            return new ResultUtil<>().error("角色值已存在");
        }

        //存入角色
        SysRole sysRole = new SysRole();
        sysRole.setName(roleAddEditRequest.getRoleName());
        sysRole.setCode(roleAddEditRequest.getRoleValue());
        sysRole.setStatus(roleAddEditRequest.getStatus());
        sysRole.setDescription(roleAddEditRequest.getRemark());
        if (!roleService.save(sysRole)) {
            throw new SkeletonException(ResultCodeEnums.SAVE_DATA_ERROR.getMsg());
        }

        //存入角色的菜单权限
        if (ObjectUtil.isNotNull(roleAddEditRequest.getMenu()) && !roleAddEditRequest.getMenu().isEmpty()) {
            List<Integer> menu = roleAddEditRequest.getMenu();
            menu.forEach(x -> {
                //存入权限
                SysRolePermission rolePermission = new SysRolePermission();
                rolePermission.setRoleId(sysRole.getId());
                rolePermission.setPermissionId(x);
                if (!rolePermissionService.save(rolePermission)) {
                    throw new SkeletonException(ResultCodeEnums.SAVE_DATA_ERROR.getMsg());
                }
            });
        }

        return new ResultUtil<>().success(true);
    }

    @PostMapping("/edit")
    @Transactional(rollbackFor = Exception.class)
    public Result<Object> edit(@Valid RoleAddEditRequest roleAddEditRequest) {
        SysRole sysRole = roleService.getById(roleAddEditRequest.getId());

        //查询角色是否已存在
        QueryWrapper<SysRole> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(SysRole::getCode, roleAddEditRequest.getRoleValue());
        SysRole exist = roleService.getOne(queryWrapper);
        if (ObjectUtil.isNotNull(exist) && !exist.getId().equals(roleAddEditRequest.getId())) {
            return new ResultUtil<>().error("角色已存在");
        }

        sysRole.setName(roleAddEditRequest.getRoleName());
        sysRole.setCode(roleAddEditRequest.getRoleValue());
        sysRole.setDescription(roleAddEditRequest.getRemark());
        sysRole.setStatus(roleAddEditRequest.getStatus());

        if (!roleService.updateById(sysRole)) {
            throw new SkeletonException(ResultCodeEnums.SAVE_DATA_ERROR.getMsg());
        }

        if (ObjectUtil.isNotNull(roleAddEditRequest.getMenu()) && !roleAddEditRequest.getMenu().isEmpty()) {
            //查出当前角色的权限
            QueryWrapper<SysRolePermission> sysRolePermissionQueryWrapper = new QueryWrapper<>();
            sysRolePermissionQueryWrapper.lambda().eq(SysRolePermission::getRoleId, sysRole.getId());
            List<SysRolePermission> rolePermissionList = rolePermissionService.list(sysRolePermissionQueryWrapper);

            //数据库现有的权限
            List<Integer> existList = new ArrayList<>();
            rolePermissionList.forEach(x -> existList.add(x.getPermissionId()));

            //请求的权限
            List<Integer> requestList = roleAddEditRequest.getMenu();

            //计算相同的权限
            List<Integer> sameList = new ArrayList<>(requestList);
            sameList.retainAll(existList);

            //数据库有，请求的没有，要删除
            existList.removeAll(sameList);
            existList.forEach(x -> {
                QueryWrapper<SysRolePermission> queryWrapperRemove = new QueryWrapper<>();
                queryWrapperRemove.lambda().eq(SysRolePermission::getPermissionId, x);
                queryWrapperRemove.lambda().eq(SysRolePermission::getRoleId, sysRole.getId());
                if (!rolePermissionService.remove(queryWrapperRemove)) {
                    throw new SkeletonException(ResultCodeEnums.SAVE_DATA_ERROR.getMsg());
                }
            });

            //数据没有，请求有，要新增
            requestList.removeAll(sameList);
            requestList.forEach(x -> {
                SysRolePermission rolePermission = new SysRolePermission();
                rolePermission.setRoleId(sysRole.getId());
                rolePermission.setPermissionId(x);
                if (!rolePermissionService.save(rolePermission)) {
                    throw new SkeletonException(ResultCodeEnums.SAVE_DATA_ERROR.getMsg());
                }
            });

            requestList.retainAll(existList);
        }

        return new ResultUtil<>().success(true);
    }

    @DeleteMapping("/delete/{id}")
    @Transactional(rollbackFor = Exception.class)
    public Result<Object> edit(@PathVariable String id) {
        if (!roleService.removeById(id)) {
            throw new SkeletonException(ResultCodeEnums.SAVE_DATA_ERROR.getMsg());
        }

        //删除所有的权限
        QueryWrapper<SysRolePermission> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(SysRolePermission::getRoleId, id);

        int hasPermission = rolePermissionService.count(queryWrapper);

        if (hasPermission > 0 && !rolePermissionService.remove(queryWrapper)) {
            throw new SkeletonException(ResultCodeEnums.SAVE_DATA_ERROR.getMsg());
        }

        return new ResultUtil<>().success(true);
    }

    @PostMapping("/setStatus")
    public Result<Object> setStatus(
            @RequestParam Integer id,
            @RequestParam Integer status
    ) {

        SysRole sysRole = roleService.getById(id);
        sysRole.setStatus(status);
        if (roleService.updateById(sysRole)) {
            return new ResultUtil<>().success(true);
        }

        return new ResultUtil<>().error();
    }

}