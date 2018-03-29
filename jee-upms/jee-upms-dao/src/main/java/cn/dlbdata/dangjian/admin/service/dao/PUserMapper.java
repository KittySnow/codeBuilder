package cn.dlbdata.dangjian.admin.service.dao;

import cn.dlbdata.dangjian.admin.service.model.PUser;
import cn.dlbdata.dangjian.admin.service.model.PUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PUserMapper {
    long countByExample(PUserExample example);

    int deleteByExample(PUserExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(PUser record);

    int insertSelective(PUser record);

    List<PUser> selectByExample(PUserExample example);

    PUser selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") PUser record, @Param("example") PUserExample example);

    int updateByExample(@Param("record") PUser record, @Param("example") PUserExample example);

    int updateByPrimaryKeySelective(PUser record);

    int updateByPrimaryKey(PUser record);
}