package cn.dlbdata.dangjian.admin.dao;

import cn.dlbdata.dangjian.admin.model.PScore;
import cn.dlbdata.dangjian.admin.model.PScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PScoreDAO {
    long countByExample(PScoreExample example);

    int deleteByExample(PScoreExample example);

    int deleteByPrimaryKey(Integer scoreid);

    int insert(PScore record);

    int insertSelective(PScore record);

    List<PScore> selectByExample(PScoreExample example);

    PScore selectByPrimaryKey(Integer scoreid);

    int updateByExampleSelective(@Param("record") PScore record, @Param("example") PScoreExample example);

    int updateByExample(@Param("record") PScore record, @Param("example") PScoreExample example);

    int updateByPrimaryKeySelective(PScore record);

    int updateByPrimaryKey(PScore record);
}