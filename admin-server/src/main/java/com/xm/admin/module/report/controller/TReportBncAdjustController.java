package com.xm.admin.module.report.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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


    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list() {
        return "hello!";
    }
}
