package com.hyz.service.impl;

import com.hyz.mapper.ClassTableMapper;
import com.hyz.mapper.PrivateClassTableMapper;
import com.hyz.pojo.ClassTable;
import com.hyz.pojo.PrivateClassTable;
import com.hyz.service.ClassTableService;
import com.hyz.service.PrivateClassTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZhangMing [1157038410@qq.com]
 * @date 2021/8/11
 */

@Service
public class PrivateClassTableServiceImpl implements PrivateClassTableService {

    @Autowired
    private PrivateClassTableMapper privateClassTableMapper;

    @Override
    public List<PrivateClassTable> findAll() {
        return privateClassTableMapper.findAll();
    }

    @Override
    public PrivateClassTable selectByClassId(Integer classId) {
        return privateClassTableMapper.selectByClassId(classId);
    }

    @Override
    public Boolean insertClass(PrivateClassTable privateClassTable) {
        return privateClassTableMapper.insertClass(privateClassTable);
    }


}
