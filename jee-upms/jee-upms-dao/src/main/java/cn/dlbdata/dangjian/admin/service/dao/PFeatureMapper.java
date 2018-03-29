package cn.dlbdata.dangjian.admin.service.dao;

import cn.dlbdata.dangjian.admin.service.model.PFeature;
import cn.dlbdata.dangjian.admin.service.model.PFeatureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PFeatureMapper {
    long countByExample(PFeatureExample example);

    int deleteByExample(PFeatureExample example);

    int deleteByPrimaryKey(Integer featureid);

    int insert(PFeature record);

    int insertSelective(PFeature record);

    List<PFeature> selectByExample(PFeatureExample example);

    PFeature selectByPrimaryKey(Integer featureid);

    int updateByExampleSelective(@Param("record") PFeature record, @Param("example") PFeatureExample example);

    int updateByExample(@Param("record") PFeature record, @Param("example") PFeatureExample example);

    int updateByPrimaryKeySelective(PFeature record);

    int updateByPrimaryKey(PFeature record);
}