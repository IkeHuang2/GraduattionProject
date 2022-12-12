package com.hyz.mapper;

import com.hyz.pojo.ClassOrder;
import com.hyz.pojo.PrivateClassOrder;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ZhangMing [1157038410@qq.com]
 * @date 2021/8/11
 */

@Mapper
public interface PrivateClassOrderMapper {

    //查询所有报名表信息
    List<ClassOrder> findAll();


    //查询会员是否报名该课程
    PrivateClassOrder selectMemberByClassIdAndMemberAccount(@Param("classId") Integer classId, @Param("memberAccount") Integer memberAccount);

    Boolean insertClassOrder(PrivateClassOrder privateClassOrder);

    List<PrivateClassOrder> selectClassOrderByMemberAccount(@Param("memberAccount") Integer memberAccount);

    List<PrivateClassOrder> selectMemberOrderList(Integer classId);
}
