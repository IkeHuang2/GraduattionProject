package com.hyz.service;

import com.hyz.pojo.Locker;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LockerService {
    Boolean updateLockerStatusByMemberAccount(Integer memberAccount,Integer lockerNumberId);
    List<Locker> getAll();
    Boolean resetBox(Integer lockerNumberId);
    Locker getInfoByMemberId(Integer lockerNumberId);
}
