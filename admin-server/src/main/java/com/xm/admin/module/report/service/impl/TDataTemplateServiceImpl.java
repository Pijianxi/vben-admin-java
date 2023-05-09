package com.xm.admin.module.report.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xm.admin.module.content.entity.ConArticleInfo;
import com.xm.admin.module.content.mapper.ConArticleInfoMapper;
import com.xm.admin.module.report.entity.TDataTemplate;
import com.xm.admin.module.report.mapper.TDataTemplateMapper;
import com.xm.admin.module.report.service.ITDataTemplateService;
import com.xm.common.vo.ExtraVo;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * <p>
 * 数据导入模版 服务实现类
 * </p>
 *
 * @author pijianxi
 * @since 2023-05-09
 */
@Service
public class TDataTemplateServiceImpl extends ServiceImpl<TDataTemplateMapper, TDataTemplate> implements ITDataTemplateService {


    final TDataTemplateMapper dataTemplateMapper;

    public TDataTemplateServiceImpl(TDataTemplateMapper dataTemplateMapper) {
        this.dataTemplateMapper = dataTemplateMapper;
    }

    @Override
    public IPage<Map<String, Object>> getTemplateList(IPage<Map<String, Object>> page, TDataTemplate templateInfo, ExtraVo extraVo) {
        return dataTemplateMapper.selectTemplateList(page,templateInfo,extraVo);
    }
}
