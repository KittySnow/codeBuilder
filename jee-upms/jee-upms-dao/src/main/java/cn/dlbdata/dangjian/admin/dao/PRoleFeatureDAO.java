package cn.dlbdata.dangjian.admin.dao;

import cn.dlbdata.dangjian.admin.model.PRoleFeature;
import cn.dlbdata.dangjian.admin.model.PRoleFeatureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PRoleFeatureDAO {
    long countByExample(PRoleFeatureExample example);

    int deleteByExample(PRoleFeatureExample example);

    int deleteByPrimaryKey(Integer rfid);

    int insert(PRoleFeature record);

    int insertSelective(PRoleFeature record);

    List<PRoleFeature> selectByExample(PRoleFeatureExample example);

    PRoleFeature selectByPrimaryKey(Integer rfid);

    int updateByExampleSelective(@Param("record") PRoleFeature record, @Param("example") PRoleFeatureExample example);

    int updateByExample(@Param("record") PRoleFeature record, @Param("example") PRoleFeatureExample example);

    int updateByPrimaryKeySelective(PRoleFeature record);

    int updateByPrimaryKey(PRoleFeature record);
}