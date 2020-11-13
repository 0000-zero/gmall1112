package com.gmall.service;


import com.gmall.beans.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @author zero
 * @create 2020-11-12 21:10
 */
public interface UmsMemberReceiveAddressService {
    List<UmsMemberReceiveAddress> getAddrByMemberId(String memberId);
}
