package com.hyz.mapper;

import com.hyz.pojo.ClassTable;
import com.hyz.pojo.PrivateClassTable;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ZhangMing [1157038410@qq.com]
 * @date 2021/8/11
 */

@Mapper
public interface PrivateClassTableMapper {

    //查询所有课程
    List<PrivateClassTable> findAll();

    PrivateClassTable selectByClassId(Integer classId);

    Boolean insertClass(PrivateClassTable privateClassTable);

}
