package com.at.gmall.gmalluser.controller;

import com.gmall.beans.UmsMember;
import com.gmall.beans.UmsMemberReceiveAddress;
import com.gmall.service.UmsMemberReceiveAddressService;
import com.gmall.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    UmsMemberService umsMemberService;

    @Autowired
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
