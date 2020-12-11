package com.at.gmall.item.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gmall.beans.PmsProductSaleAttr;
import com.gmall.beans.PmsSkuInfo;
import com.gmall.service.SkuService;
import com.gmall.service.SupService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author zero
 * @create 2020-11-16 9:16
 */
@Controller
public class ItemController {

    @Reference
    SkuService skuService;

    @Reference
    SupService supService;


    @GetMapping("/{skuId}.html")
    public String indexPage(@PathVariable("skuId") String skuId,
                            Model model){

        PmsSkuInfo skuInfo = skuService.getSkuInfoById(skuId);

        model.addAttribute("skuInfo",skuInfo);

        List<PmsProductSaleAttr> pmsProductSaleAttrs = supService.spuSaleAttrListCheckBySku(skuInfo.getProductId(),skuInfo.getId());
        model.addAttribute("spuSaleAttrListCheckBySku",pmsProductSaleAttrs);

        return "item";
    }

}
