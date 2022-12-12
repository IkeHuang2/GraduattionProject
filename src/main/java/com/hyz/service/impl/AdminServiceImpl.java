package com.hyz.service.impl;

import com.hyz.mapper.AdminMapper;
import com.hyz.pojo.Admin;
import com.hyz.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin adminLogin(Admin admin) {
        System.out.println(admin+"这是在service");
        Admin admin1 = adminMapper.selectByAccountAndPassword(admin);
        System.out.println("SQL返回结果:" + admin1);
        return admin1;
    }
}
