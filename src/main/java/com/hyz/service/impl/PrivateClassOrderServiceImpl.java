package com.hyz.service.impl;

import com.hyz.mapper.PrivateClassOrderMapper;
import com.hyz.mapper.PrivateClassTableMapper;
import com.hyz.pojo.ClassOrder;
import com.hyz.pojo.PrivateClassOrder;
import com.hyz.pojo.PrivateClassTable;
import com.hyz.service.PrivateClassOrderService;
import com.hyz.service.PrivateClassTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ZhangMing [1157038410@qq.com]
 * @date 2021/8/11
 */

@Service
@Resource
public class PrivateClassOrderServiceImpl implements PrivateClassOrderService {
    @Autowired
    private PrivateClassOrderMapper privateClassOrderMapper;

    @Override
    public PrivateClassOrder selectMemberByClassIdAndMemberAccount(Integer classId, Integer memberAccount) {

        return privateClassOrderMapper.selectMemberByClassIdAndMemberAccount(classId,memberAccount);
    }

    @Override
    public Boolean insertClassOrder(PrivateClassOrder privateClassOrder) {
        return privateClassOrderMapper.insertClassOrder(privateClassOrder);
    }

    @Override
    public List<PrivateClassOrder> selectClassOrderByMemberAccount(Integer memberAccount) {
        return privateClassOrderMapper.selectClassOrderByMemberAccount(memberAccount);
    }

    @Override
    public List<PrivateClassOrder> selectMemberOrderList(Integer classId) {
        return privateClassOrderMapper.selectMemberOrderList(classId);
    }
}
