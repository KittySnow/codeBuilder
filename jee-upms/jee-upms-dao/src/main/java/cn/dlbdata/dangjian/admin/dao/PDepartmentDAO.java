package cn.dlbdata.dangjian.admin.dao;

import cn.dlbdata.dangjian.admin.model.PDepartment;
import cn.dlbdata.dangjian.admin.model.PDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PDepartmentDAO {
    long countByExample(PDepartmentExample example);

    int deleteByExample(PDepartmentExample example);

    int deleteByPrimaryKey(Integer departmentid);

    int insert(PDepartment record);

    int insertSelective(PDepartment record);

    List<PDepartment> selectByExample(PDepartmentExample example);

    PDepartment selectByPrimaryKey(Integer departmentid);

    int updateByExampleSelective(@Param("record") PDepartment record, @Param("example") PDepartmentExample example);

    int updateByExample(@Param("record") PDepartment record, @Param("example") PDepartmentExample example);

    int updateByPrimaryKeySelective(PDepartment record);

    int updateByPrimaryKey(PDepartment record);
}