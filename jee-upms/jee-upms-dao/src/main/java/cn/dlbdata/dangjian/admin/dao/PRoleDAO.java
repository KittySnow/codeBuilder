package cn.dlbdata.dangjian.admin.dao;

import cn.dlbdata.dangjian.admin.model.PRole;
import cn.dlbdata.dangjian.admin.model.PRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PRoleDAO {
    long countByExample(PRoleExample example);

    int deleteByExample(PRoleExample example);

    int deleteByPrimaryKey(Integer roleid);

    int insert(PRole record);

    int insertSelective(PRole record);

    List<PRole> selectByExample(PRoleExample example);

    PRole selectByPrimaryKey(Integer roleid);

    int updateByExampleSelective(@Param("record") PRole record, @Param("example") PRoleExample example);

    int updateByExample(@Param("record") PRole record, @Param("example") PRoleExample example);

    int updateByPrimaryKeySelective(PRole record);

    int updateByPrimaryKey(PRole record);
}