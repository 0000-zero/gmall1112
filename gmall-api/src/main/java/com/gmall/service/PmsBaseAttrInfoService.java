package com.gmall.service;

import com.gmall.beans.PmsBaseAttrInfo;

import java.util.List;

/**
 * @author zero
 * @create 2020-11-14 19:25
 */
public interface PmsBaseAttrInfoService {
    List<PmsBaseAttrInfo> getAttrInfos(String catalog3Id);
}
