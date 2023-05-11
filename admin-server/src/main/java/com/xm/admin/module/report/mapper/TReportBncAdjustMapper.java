package com.xm.admin.module.report.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xm.admin.module.report.entity.TReportBncAdjust;
import com.xm.common.vo.ExtraVo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * bnc调整报表 Mapper 接口
 * </p>
 *
 * @author pijianxi
 * @since 2023-05-09
 */
@Repository
public interface TReportBncAdjustMapper extends BaseMapper<TReportBncAdjust> {

    List<Map<String, Object>> selectBncAdjustList(IPage<Map<String, Object>> page, TReportBncAdjust bncAdjust, ExtraVo extraVo);
}
