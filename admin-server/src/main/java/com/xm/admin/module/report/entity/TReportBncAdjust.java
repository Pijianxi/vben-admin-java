package com.xm.admin.module.report.entity;

import com.xm.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * bnc调整报表
 * </p>
 *
 * @author pijianxi
 * @since 2023-05-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class TReportBncAdjust extends BaseEntity{

    private static final long serialVersionUID = 1L;

    /**
     * 年
     */
    private Integer year;

    private String yearTxt;

    /**
     * 月
     */
    private Integer month;

    private String monthTxt;

    /**
     * 组织
     */
    private String org;

    private String orgTxt;

    /**
     * 主题
     */
    private String subjectCode;

    private String subjectTxt;

    /**
     * 报表项目
     */
    private String itemCode;

    private String itemTxt;

    /**
     * 渠道
     */
    private String channelCode;

    private String channelTxt;

    /**
     * 数值
     */
    private Integer value;

    /**
     * 备注1
     */
    private String remark1;

    /**
     * 备注2
     */
    private String remark2;

}
