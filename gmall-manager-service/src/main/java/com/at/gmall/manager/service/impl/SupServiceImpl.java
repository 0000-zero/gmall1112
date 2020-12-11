package com.at.gmall.manager.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.at.gmall.manager.mapper.PmsProductInfoMapper;
import com.at.gmall.manager.mapper.PmsProductSaleAttrMapper;
import com.at.gmall.manager.mapper.PmsProductSaleAttrValueMapper;
import com.gmall.beans.PmsProductInfo;
import com.gmall.beans.PmsProductSaleAttr;
import com.gmall.service.SupService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zero
 * @create 2020-11-14 21:44
 */
@Service
public class SupServiceImpl implements SupService {

    @Autowired
    PmsProductInfoMapper pmsProductInfoMapper;

    @Autowired
    PmsProductSaleAttrMapper pmsProductSaleAttrMapper;

    @Autowired
    PmsProductSaleAttrValueMapper pmsProductSaleAttrValueMapper;


    @Override
    public List<PmsProductInfo> getSpuList(String catalog3Id) {
        PmsProductInfo pmsProductInfo = new PmsProductInfo();
        pmsProductInfo.setCatalog3Id(catalog3Id);

        List<PmsProductInfo> select = pmsProductInfoMapper.select(pmsProductInfo);

        return select;
    }

    @Override
    public void saveSpuInfo(PmsProductInfo pmsProductInfo) {


    }

    @Override
    public List<PmsProductSaleAttr> spuSaleAttrListCheckBySku(String skuId, String productId) {

//        PmsProductSaleAttr pmsProductSaleAttr = new PmsProductSaleAttr();
//        pmsProductSaleAttr.setProductId(productId);
//        List<PmsProductSaleAttr> select = pmsProductSaleAttrMapper.select(pmsProductSaleAttr);
//
//        for (PmsProductSaleAttr productSaleAttr : select) {
//
//            PmsProductSaleAttrValue pmsProductSaleAttrValue  =new PmsProductSaleAttrValue();
//            pmsProductSaleAttrValue.setSaleAttrId(productSaleAttr.getSaleAttrId());
//            pmsProductSaleAttrValue.setProductId(productId);
//            List<PmsProductSaleAttrValue> select1 = pmsProductSaleAttrValueMapper.select(pmsProductSaleAttrValue);
//
//            productSaleAttr.setPmsProductSaleAttrValueList(select1);
//
//        }

        List<PmsProductSaleAttr> select = pmsProductSaleAttrMapper.spuSaleAttrListCheckBySku(productId,skuId);


        return select;
    }
}
