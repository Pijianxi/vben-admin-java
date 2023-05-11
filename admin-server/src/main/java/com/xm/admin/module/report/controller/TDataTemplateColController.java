package com.xm.admin.module.report.controller;

import cn.hutool.core.map.MapBuilder;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xm.admin.module.content.entity.ConArticleInfo;
import com.xm.admin.module.report.entity.TDataTemplateCol;
import com.xm.admin.module.report.service.ITDataTemplateColService;
import com.xm.admin.module.report.service.ITDataTemplateService;
import com.xm.common.utils.CommonPageUtil;
import com.xm.common.utils.ResultUtil;
import com.xm.common.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
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
@RequestMapping("/report/tDataTemplateCol")
public class TDataTemplateColController {

    final ITDataTemplateColService dataTemplateColService;

    public TDataTemplateColController(ITDataTemplateColService dataTemplateColService) {
        this.dataTemplateColService = dataTemplateColService;
    }

    @GetMapping("/getColListByTemplateId/{id}")
    public Result<Object> getArticle(@PathVariable Long id) {

//        QueryWrapper<TDataTemplateCol> qw = new QueryWrapper<TDataTemplateCol>();
//        qw.eq("TEMPLATE_ID",id);
        List<Map<String, Object>> list = dataTemplateColService.getColListByTemplateId(id);

//        IPage<Map<String, Object>> articleInfoList = articleInfoService.getArticleList(page, articleInfo, extraVo);
//        articleInfoList.getRecords().forEach(x -> x.put("thumb", new String[]{x.get("thumb").toString()}));
        return new ResultUtil<>().success(list);

    }


}
