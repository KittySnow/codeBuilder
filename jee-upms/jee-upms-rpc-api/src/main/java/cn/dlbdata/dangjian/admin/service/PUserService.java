package cn.dlbdata.dangjian.admin.service;

import cn.dlbdata.dangjian.admin.model2.PUser;
import cn.dlbdata.dangjian.admin.model2.PUserExample;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface PUserService {

    public long countByExample(PUserExample example);
    
    public int deleteByExample(PUserExample example);
    
    public int deleteByPrimaryKey(Integer userid);
    
    public int insert(PUser pUser);
    
    public int insertSelective(PUser pUser);
    
    public List<PUser> selectByExample(PUserExample example);

    public PUser selectByPrimaryKey(Integer userid);

    public int updateByExampleSelective(@Param("pUser") PUser pUser, @Param("example") PUserExample example);

    public int updateByExample(@Param("pUser") PUser pUser, @Param("example") PUserExample example);

    public int updateByPrimaryKeySelective(PUser pUser);

    public int updateByPrimaryKey(PUser pUser);
    
}