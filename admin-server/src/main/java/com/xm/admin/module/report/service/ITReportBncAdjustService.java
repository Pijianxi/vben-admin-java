package com.xm.admin.module.report.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xm.admin.module.report.entity.TReportBncAdjust;
import com.xm.common.vo.ExtraVo;

import java.util.Map;

/**
 * <p>
 * bnc调整报表 服务类
 * </p>
 *
 * @author pijianxi
 * @since 2023-05-09
 */
public interface ITReportBncAdjustService extends IService<TReportBncAdjust> {

    IPage<Map<String, Object>> getBncAdjustList(IPage<Map<String, Object>> page, TReportBncAdjust bncAdjust, ExtraVo extraVo);
}
