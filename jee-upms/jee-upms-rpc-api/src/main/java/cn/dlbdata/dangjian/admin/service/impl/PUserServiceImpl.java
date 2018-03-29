package cn.dlbdata.dangjian.admin.service.impl;


import cn.dlbdata.dangjian.admin.dao2.PUserDao;
import cn.dlbdata.dangjian.admin.model2.PUser;
import cn.dlbdata.dangjian.admin.model2.PUserExample;
import cn.dlbdata.dangjian.admin.service.PUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service("PUserService")
public class PUserServiceImpl implements PUserService {

    private static Logger _log = LoggerFactory.getLogger(PUserServiceImpl.class);

    @Autowired
    PUserDao pUserDao;

    @Override
    public long countByExample(PUserExample example) {
        return pUserDao.countByExample(example);
    }
    
    @Override
    public int deleteByExample(PUserExample example) {
        return pUserDao.deleteByExample(example);
    }
    
    @Override
    public int deleteByPrimaryKey(Integer userid) {
        return pUserDao.deleteByPrimaryKey(userid);
    }
    
    @Override
    public int insert(PUser pUser) {
        pUserDao.insert(pUser);
        return pUser.getuserid();
    }
    
    @Override
    public int insertSelective(PUser pUser) {
        pUserDao.insertSelective(pUser);
        return pUser.getuserid();
    }
    
    @Override
    public List<PUser> selectByExample(PUserExample example) {
        return pUserDao.selectByExample(example);
    }

    @Override
    public PUser selectByPrimaryKey(Integer userid) {
        return pUserDao.selectByPrimaryKey(userid);
    }

    @Override
    public int updateByExampleSelective(PUser pUser, PUserExample example) {
        return pUserDao.updateByExampleSelective(pUser,example);
    }

    @Override
    public int updateByExample(PUser pUser, PUserExample example) {
        return pUserDao.updateByExample(pUser,example);
    }

    @Override
    public int updateByPrimaryKeySelective(PUser pUser) {
        return pUserDao.updateByPrimaryKeySelective(pUser);
    }

    @Override
    public int updateByPrimaryKey(PUser pUser) {
        return pUserDao.updateByPrimaryKey(pUser);
    }

}