package com.xm.admin.module.report.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xm.admin.module.report.entity.TDataTemplate;
import com.xm.common.vo.ExtraVo;

import java.util.Map;

/**
 * <p>
 * 数据导入模版 服务类
 * </p>
 *
 * @author pijianxi
 * @since 2023-05-09
 */
public interface ITDataTemplateService extends IService<TDataTemplate> {

    IPage<Map<String, Object>> getTemplateList(IPage<Map<String, Object>> page, TDataTemplate template, ExtraVo extraVo);
}
