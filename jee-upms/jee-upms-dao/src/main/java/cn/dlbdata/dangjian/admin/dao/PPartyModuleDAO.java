package cn.dlbdata.dangjian.admin.dao;

import cn.dlbdata.dangjian.admin.model.PPartyModule;
import cn.dlbdata.dangjian.admin.model.PPartyModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PPartyModuleDAO {
    long countByExample(PPartyModuleExample example);

    int deleteByExample(PPartyModuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PPartyModule record);

    int insertSelective(PPartyModule record);

    List<PPartyModule> selectByExample(PPartyModuleExample example);

    PPartyModule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PPartyModule record, @Param("example") PPartyModuleExample example);

    int updateByExample(@Param("record") PPartyModule record, @Param("example") PPartyModuleExample example);

    int updateByPrimaryKeySelective(PPartyModule record);

    int updateByPrimaryKey(PPartyModule record);
}