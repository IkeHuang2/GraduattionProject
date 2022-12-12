package com.hyz.service.impl;

import com.hyz.mapper.LockerMapper;
import com.hyz.pojo.Locker;
import com.hyz.service.LockerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LockerServiceImpl implements LockerService {

    @Autowired
    private LockerMapper lockerMapper;

    @Override
    public Boolean updateLockerStatusByMemberAccount(Integer memberAccount,Integer lockerNumberId) {
        System.out.println(memberAccount);
        System.out.println(lockerNumberId);
        return lockerMapper.updateLockerStatusByMemberAccount(memberAccount,lockerNumberId);
    }

    @Override
    public List<Locker> getAll() {
        return lockerMapper.getAll();
    }

    @Override
    public Boolean resetBox(Integer lockerNumberId) {
        return lockerMapper.resetBox(lockerNumberId);
    }

    @Override
    public Locker getInfoByMemberId(Integer lockerNumberId) {
        return lockerMapper.getInfoByMemberId(lockerNumberId);
    }
}
