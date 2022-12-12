package com.hyz.mapper;

import com.hyz.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@Mapper
public interface AdminMapper {
    Admin selectByAccountAndPassword(Admin admin);
}
