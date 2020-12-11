package com.gmall.service;

import com.gmall.beans.PmsSkuInfo;

/**
 * @author zero
 * @create 2020-11-16 9:24
 */
public interface SkuService {

    PmsSkuInfo getSkuInfoById(String skuId);
}
