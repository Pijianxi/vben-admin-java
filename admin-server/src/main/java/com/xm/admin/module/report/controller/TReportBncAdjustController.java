package com.xm.admin.module.report.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xm.admin.module.report.entity.TDataTemplate;
import com.xm.admin.module.report.entity.TReportBncAdjust;
import com.xm.admin.module.report.service.ITDataTemplateService;
import com.xm.admin.module.report.service.ITReportBncAdjustService;
import com.xm.common.utils.CommonPageUtil;
import com.xm.common.utils.ResultUtil;
import com.xm.common.vo.ExtraVo;
import com.xm.common.vo.Result;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * <p>
 * bnc调整报表 前端控制器
 * </p>
 *
 * @author pijianxi
 * @since 2023-05-09
 */
@RestController
@RequestMapping("/report/tReportBncAdjust")
public class TReportBncAdjustController {

    final ITReportBncAdjustService reportBncAdjustService;

    public TReportBncAdjustController(ITReportBncAdjustService reportBncAdjustService) {
        this.reportBncAdjustService = reportBncAdjustService;
    }


    @GetMapping("/getByCondition")
    public Result<Object> getByCondition(
            @ModelAttribute TReportBncAdjust bncAdjust,
            @ModelAttribute ExtraVo extraVo
    ) {
        IPage<Map<String, Object>> page = new CommonPageUtil<Map<String, Object>>().initIPage(extraVo);

        IPage<Map<String, Object>> reportInfoList=reportBncAdjustService.getBncAdjustList(page,bncAdjust,extraVo);
//        IPage<Map<String, Object>> articleInfoList = articleInfoService.getArticleList(page, articleInfo, extraVo);
//        articleInfoList.getRecords().forEach(x -> x.put("thumb", new String[]{x.get("thumb").toString()}));
        return new ResultUtil<>().success(reportInfoList);
    }

    @PostMapping("/add")
    public Result<Object> add(@ModelAttribute TReportBncAdjust bnc) {
        if (reportBncAdjustService.save(bnc)) {
            return new ResultUtil<>().success(true);
        } else {
            return new ResultUtil<>().error("添加失败");
        }
    }

    @PostMapping("/edit")
    public Result<Object> edit(@ModelAttribute TReportBncAdjust bnc) {
        if (reportBncAdjustService.updateById(bnc)) {
            return new ResultUtil<>().success(true);
        } else {
            return new ResultUtil<>().error("编辑失败");
        }
    }
}
