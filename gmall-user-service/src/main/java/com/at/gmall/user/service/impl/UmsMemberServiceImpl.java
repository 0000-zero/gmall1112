package com.at.gmall.user.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.at.gmall.user.mapper.UmsMemberMapper;
import com.gmall.beans.UmsMember;
import com.gmall.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;

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
        System.out.println("被调用了...................");

        List<UmsMember> memberList = umsMemberMapper.selectAll();

        return memberList;
    }


}
