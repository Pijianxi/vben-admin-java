package com.xm.admin.module.report.entity;

import com.xm.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

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
public class TDataTemplate extends BaseEntity{

    private static final long serialVersionUID = 1L;

    /**
     * 数据库表名
     */
    private String tableName;

    /**
     * 模版编码
     */
    private String code;

    /**
     * 模版名称
     */
    private String name;

    /**
     * 主题code
     */
    private String subjectCode;

    /**
     * 主题名称
     */
    private String subjectName;

    private String createBy;

    /**
     * 创建时间
     */
    private LocalDateTime createAt;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private LocalDateTime updateAt;

}
