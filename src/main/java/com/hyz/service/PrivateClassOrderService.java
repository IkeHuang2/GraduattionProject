package com.hyz.service;

import com.hyz.pojo.ClassOrder;
import com.hyz.pojo.PrivateClassOrder;
import com.hyz.pojo.PrivateClassTable;

import java.util.List;

/**
 * @author ZhangMing [1157038410@qq.com]
 * @date 2021/8/11
 */

public interface PrivateClassOrderService {

    //查询所有课程
    PrivateClassOrder selectMemberByClassIdAndMemberAccount(Integer classId, Integer memberAccount);

    Boolean insertClassOrder(PrivateClassOrder privateClassOrder);

    List<PrivateClassOrder> selectClassOrderByMemberAccount(Integer memberAccount);

    List<PrivateClassOrder> selectMemberOrderList(Integer classId);

}
