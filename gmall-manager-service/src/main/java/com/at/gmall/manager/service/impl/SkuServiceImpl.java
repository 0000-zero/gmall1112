package com.at.gmall.manager.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.at.gmall.manager.mapper.PmsSkuImageMapper;
import com.at.gmall.manager.mapper.PmsSkuInfoMapper;
import com.gmall.beans.PmsSkuAttrValue;
import com.gmall.beans.PmsSkuImage;
import com.gmall.beans.PmsSkuInfo;
import com.gmall.beans.PmsSkuSaleAttrValue;
import com.gmall.service.SkuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zero
 * @create 2020-11-16 9:25
 */
@Service
public class SkuServiceImpl implements SkuService {

    @Autowired
    PmsSkuInfoMapper pmsSkuInfoMapper;

    @Autowired
    PmsSkuImageMapper pmsSkuImageMapper;

    @Override
    public PmsSkuInfo getSkuInfoById(String skuId) {

        PmsSkuInfo skuInfo = new PmsSkuInfo();
        skuInfo.setId(skuId);

        skuInfo = pmsSkuInfoMapper.selectOne(skuInfo);


        PmsSkuImage pmsSkuImage = new PmsSkuImage();
        pmsSkuImage.setSkuId(skuId);
        List<PmsSkuImage> pmsSkuImages = pmsSkuImageMapper.select(pmsSkuImage);
        skuInfo.setPmsSkuImageList(pmsSkuImages);

        List<PmsSkuAttrValue> pmsSkuAttrValueList;
        List<PmsSkuSaleAttrValue> pmsSkuSaleAttrValueList;

        return skuInfo;
    }
}
