package com.at.gmall.gmalluser.service.impl;


import com.at.gmall.gmalluser.mapper.UmsMemberMapper;
import com.gmall.beans.UmsMember;
import com.gmall.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zero
 * @create 2020-11-12 20:06
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    UmsMemberMapper umsMemberMapper;

    @Override
    public List<UmsMember> getAllMember() {
//        List<UmsMember> allMember = umsMemberMapper.getAllMember();

        List<UmsMember> memberList = umsMemberMapper.selectAll();

        return memberList;
    }


}
