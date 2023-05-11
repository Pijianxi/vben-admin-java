package com.xm.admin.module.report.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xm.admin.module.report.entity.TDataTemplateCol;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 数据导入模版 Mapper 接口
 * </p>
 *
 * @author pijianxi
 * @since 2023-05-09
 */
@Repository
public interface TDataTemplateColMapper extends BaseMapper<TDataTemplateCol> {

    List<Map<String, Object>> selectListByTemplateId(Long id);
}
