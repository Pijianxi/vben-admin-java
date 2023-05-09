package com.xm.admin.module.report.entity;

import com.xm.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 数据导入模版
 * </p>
 *
 * @author pijianxi
 * @since 2023-05-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class TDataTemplateCol extends BaseEntity{

    private static final long serialVersionUID = 1L;

    /**
     * 模版ID
     */
    private Integer templateId;

    /**
     * 数据库表名
     */
    private String tableName;

    /**
     * 数据库对应列名
     */
    private String tableColumnName;

    /**
     * 数据库列数据类型
     */
    private String columnDataType;

    /**
     * 输入数据类型
     */
    private String inputType;

    /**
     * 编码
     */
    private String colCode;

    /**
     * 显示名称
     */
    private String colName;

    /**
     * 值集类型
     */
    private String codeType;

    /**
     * 值集名称
     */
    private String codeTypeName;

    /**
     * 是否筛选条件
     */
    private String isCondition;

    /**
     * 是否必填
     */
    private String isNotNull;

    /**
     * 是否展示
     */
    private String isShow;

    /**
     * 显示顺序
     */
    private Integer orderNo;

}
