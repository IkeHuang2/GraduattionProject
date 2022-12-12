package com.hyz.service;

import com.hyz.pojo.ClassTable;
import com.hyz.pojo.PrivateClassTable;

import java.util.List;

/**
 * @author ZhangMing [1157038410@qq.com]
 * @date 2021/8/11
 */

public interface PrivateClassTableService {

    //查询所有课程
    List<PrivateClassTable> findAll();

    PrivateClassTable selectByClassId(Integer classId);

    Boolean insertClass(PrivateClassTable privateClassTable);



}
