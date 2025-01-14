package com.xm.admin.module.report.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xm.admin.module.report.entity.TDataTemplateCol;
import com.xm.admin.module.report.mapper.TDataTemplateColMapper;
import com.xm.admin.module.report.mapper.TDataTemplateMapper;
import com.xm.admin.module.report.service.ITDataTemplateColService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
public class TDataTemplateColServiceImpl extends ServiceImpl<TDataTemplateColMapper, TDataTemplateCol> implements ITDataTemplateColService {


    final TDataTemplateColMapper dataTemplateColMapper;

    public TDataTemplateColServiceImpl(TDataTemplateColMapper dataTemplateColMapper) {
        this.dataTemplateColMapper = dataTemplateColMapper;
    }

    @Override
    public List<Map<String,Object>> getColListByTemplateId(Long id) {
        return dataTemplateColMapper.selectListByTemplateId(id);
    }
}
