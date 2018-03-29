package cn.dlbdata.dangjian.admin.service.dao;

import cn.dlbdata.dangjian.admin.service.model.PScore;
import cn.dlbdata.dangjian.admin.service.model.PScoreExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PScoreMapper {
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