package com.hyz.service;

import com.hyz.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminService {
    Admin adminLogin(Admin admin);
}
