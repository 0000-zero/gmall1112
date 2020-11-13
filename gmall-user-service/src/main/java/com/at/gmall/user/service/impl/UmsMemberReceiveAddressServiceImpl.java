package com.at.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.at.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.gmall.beans.UmsMemberReceiveAddress;
import com.gmall.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zero
 * @create 2020-11-12 21:10
 */
@Service
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService {

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;


    @Override
    public List<UmsMemberReceiveAddress> getAddrByMemberId(String memberId) {


        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> select = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);

//        Example example = new Example(UmsMemberReceiveAddress.class);
//        example.createCriteria().andEqualTo("memberId",memberId);
//
//        List<UmsMemberReceiveAddress> memberReceiveAddressList = umsMemberReceiveAddressMapper.selectByExample(example);

        return select;
    }
}
