package com.hyz.service.impl;

import com.hyz.mapper.MemberMapper;
import com.hyz.pojo.Member;
import com.hyz.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZhangMing [1157038410@qq.com]
 * @date 2021/8/11
 */

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public List<Member> findAll() {
        return memberMapper.findAll();
    }

    @Override
    public Boolean insertMember(Member member) {
        return memberMapper.insertMember(member);
    }

    @Override
    public Boolean updateMemberByMemberAccount(Member member) {
        return memberMapper.updateMemberByMemberAccount(member);
    }

    @Override
    public Member userLogin(Member member) {
        return memberMapper.selectByAccountAndPassword(member);
    }

    @Override
    public Boolean deleteByMemberAccount(Integer memberAccount) {
        return memberMapper.deleteByMemberAccount(memberAccount);
    }

    @Override
    public Integer selectTotalCount() {
        return memberMapper.selectTotalCount();
    }

    @Override
    public List<Member> selectByMemberAccount(Integer memberAccount) {
        return memberMapper.selectByMemberAccount(memberAccount);
    }
}
