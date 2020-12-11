package com.gmall.service;

import com.gmall.beans.PmsProductInfo;
import com.gmall.beans.PmsProductSaleAttr;

import java.util.List;

/**
 * @author zero
 * @create 2020-11-14 21:43
 */
public interface SupService {
    List<PmsProductInfo> getSpuList(String catalog3Id);

    void saveSpuInfo(PmsProductInfo pmsProductInfo);

    List<PmsProductSaleAttr> spuSaleAttrListCheckBySku(String id, String productId);
}
