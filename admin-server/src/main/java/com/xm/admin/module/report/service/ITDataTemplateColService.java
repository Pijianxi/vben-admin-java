package com.xm.admin.module.report.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xm.admin.module.report.entity.TDataTemplateCol;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 数据导入模版 服务类
 * </p>
 *
 * @author pijianxi
 * @since 2023-05-09
 */
public interface ITDataTemplateColService extends IService<TDataTemplateCol> {

    List<Map<String,Object>> getColListByTemplateId(Long id);
}
