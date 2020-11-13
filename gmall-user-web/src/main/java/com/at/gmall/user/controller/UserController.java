package com.at.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gmall.beans.UmsMember;
import com.gmall.beans.UmsMemberReceiveAddress;
import com.gmall.service.UmsMemberReceiveAddressService;
import com.gmall.service.UmsMemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zero
 * @create 2020-11-12 20:02
 */
@Controller
public class UserController {

    @Reference
    UmsMemberService umsMemberService;

    @Reference
    UmsMemberReceiveAddressService umsMemberReceiveAddressService;

    @ResponseBody
    @GetMapping("/allmember")
    public List<UmsMember> getAllMember(){
        List<UmsMember> memberList = umsMemberService.getAllMember();
        return memberList;
    }

    @ResponseBody
    @GetMapping("/addr/{memberId}")
    public List<UmsMemberReceiveAddress> getMemberAddrByMemberId(@PathVariable("memberId") String memberId){
        List<UmsMemberReceiveAddress> memberReceiveAddressList = umsMemberReceiveAddressService.getAddrByMemberId(memberId);
        return memberReceiveAddressList;
    }


}
