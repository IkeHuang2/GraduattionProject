package com.hyz.service;

import com.hyz.pojo.Employee;

import java.util.List;

/**
 * @author ZhangMing [1157038410@qq.com]
 * @date 2021/8/11
 */

public interface EmployeeService {

    //查询所有员工
    List<Employee> findAll();

    //根据员工账号删除员工
    Boolean deleteByEmployeeAccount(Integer employeeAccount);

    //添加新员工
    Boolean insertEmployee(Employee employee);

    //根据员工账号修改会员信息
    Boolean updateMemberByEmployeeAccount(Employee employee);

    //根据员工账号查询员工
    List<Employee> selectByEmployeeAccount(Integer employeeAccount);

    //查询员工数
    Integer selectTotalCount();

    //查询私教教练的信息
    List<Employee> selectFromTwoTabletToShowCoachInformation();

}
