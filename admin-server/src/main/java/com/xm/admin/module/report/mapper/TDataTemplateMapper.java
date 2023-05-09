package com.xm.admin.module.report.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xm.admin.module.content.entity.ConArticleInfo;
import com.xm.admin.module.report.entity.TDataTemplate;
import com.xm.common.vo.ExtraVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

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
public interface TDataTemplateMapper extends BaseMapper<TDataTemplate> {


    IPage<Map<String, Object>> selectTemplateList(IPage<Map<String, Object>> page, @Param("templateInfo") TDataTemplate templateInfo, ExtraVo extraVo);

}
