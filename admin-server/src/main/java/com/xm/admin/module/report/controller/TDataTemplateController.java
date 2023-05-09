package com.xm.admin.module.report.controller;

import cn.hutool.core.map.MapBuilder;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xm.admin.module.content.entity.ConArticleCategory;
import com.xm.admin.module.content.entity.ConArticleInfo;
import com.xm.admin.module.content.payload.ArticleCategoryAddEditRequest;
import com.xm.admin.module.content.service.IConArticleCategoryService;
import com.xm.admin.module.report.entity.TDataTemplate;
import com.xm.admin.module.report.service.ITDataTemplateService;
import com.xm.common.utils.CommonPageUtil;
import com.xm.common.utils.ResultUtil;
import com.xm.common.vo.ExtraVo;
import com.xm.common.vo.Result;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 数据导入模版 前端控制器
 * </p>
 *
 * @author pijianxi
 * @since 2023-05-09
 */
@RestController
@RequestMapping("/report/tDataTemplate")
public class TDataTemplateController {



    final ITDataTemplateService dataTemplateService;

    public TDataTemplateController(ITDataTemplateService dataTemplateService) {
        this.dataTemplateService = dataTemplateService;
    }


    @GetMapping("/getByCondition")
    public Result<Object> getByCondition(
            @ModelAttribute TDataTemplate template,
            @ModelAttribute ExtraVo extraVo
    ) {
        IPage<Map<String, Object>> page = new CommonPageUtil<Map<String, Object>>().initIPage(extraVo);

        IPage<Map<String, Object>> articleInfoList=dataTemplateService.getTemplateList(page,template,extraVo);
//        IPage<Map<String, Object>> articleInfoList = articleInfoService.getArticleList(page, articleInfo, extraVo);
//        articleInfoList.getRecords().forEach(x -> x.put("thumb", new String[]{x.get("thumb").toString()}));
        return new ResultUtil<>().success(articleInfoList);
    }

    @GetMapping("/detail/{id}")
    public Result<Object> getArticle(@PathVariable String id) {
        TDataTemplate articleInfo = dataTemplateService.getById(id);
        Map<String, Object> result = new MapBuilder<>(new HashMap<String, Object>(8))
                .put("id", articleInfo.getId())
                .put("code", articleInfo.getCode())
                .put("name", articleInfo.getName())
                .put("subjectCode", articleInfo.getSubjectCode())
//                .put("thumb", new String[]{articleInfo.getThumb()})
                .put("subjectName", articleInfo.getSubjectName())

                .build();
        return new ResultUtil<>().success(result);
    }

    @DeleteMapping("/delete/{ids}")
    public Result<Object> delAllByIds(@PathVariable String[] ids) {
        for (String id : ids) {
            dataTemplateService.removeById(id);
        }
        return new ResultUtil<>().success(true);
    }

    @PostMapping("/add")
    public Result<Object> add(@ModelAttribute TDataTemplate articleInfo) {
        if (dataTemplateService.save(articleInfo)) {
            return new ResultUtil<>().success(true);
        } else {
            return new ResultUtil<>().error("添加文章失败");
        }
    }

    @PostMapping("/edit")
    public Result<Object> edit(@ModelAttribute TDataTemplate articleInfo) {
        if (dataTemplateService.updateById(articleInfo)) {
            return new ResultUtil<>().success(true);
        } else {
            return new ResultUtil<>().error("编辑文章失败");
        }
    }
}
