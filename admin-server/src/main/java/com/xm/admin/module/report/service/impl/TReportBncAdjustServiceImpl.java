package com.xm.admin.module.report.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xm.admin.module.report.entity.TReportBncAdjust;
import com.xm.admin.module.report.mapper.TDataTemplateMapper;
import com.xm.admin.module.report.mapper.TReportBncAdjustMapper;
import com.xm.admin.module.report.service.ITReportBncAdjustService;
import com.xm.common.vo.ExtraVo;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * <p>
 * bnc调整报表 服务实现类
 * </p>
 *
 * @author pijianxi
 * @since 2023-05-09
 */
@Service
public class TReportBncAdjustServiceImpl extends ServiceImpl<TReportBncAdjustMapper, TReportBncAdjust> implements ITReportBncAdjustService {

    final TReportBncAdjustMapper bncAdjustMapper;

    public TReportBncAdjustServiceImpl(TReportBncAdjustMapper bncAdjustMapper) {
        this.bncAdjustMapper = bncAdjustMapper;
    }



    @Override
    public IPage<Map<String, Object>> getBncAdjustList(IPage<Map<String, Object>> page, TReportBncAdjust bncAdjust, ExtraVo extraVo) {
        return page.setRecords(bncAdjustMapper.selectBncAdjustList(page, bncAdjust, extraVo));
    }
}
