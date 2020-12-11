package com.at.gmall.manager.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.gmall.beans.PmsBaseAttrInfo;
import com.gmall.beans.PmsBaseAttrValue;
import com.gmall.beans.PmsBaseSaleAttr;
import com.gmall.service.PmsBaseAttrInfoService;
import com.gmall.service.PmsBaseAttrValueService;
import com.gmall.service.PmsBaseSaleAttrService;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @author zero
 * @create 2020-11-14 19:20
 */
@CrossOrigin
@RestController
public class AttrController {

    @Reference
    PmsBaseAttrInfoService pmsBaseAttrInfoService;

    @Reference
    PmsBaseAttrValueService pmsBaseAttrValueService;

    @Reference
    PmsBaseSaleAttrService pmsBaseSaleAttrService;




    //baseSaleAttrList
    @RequestMapping("/baseSaleAttrList")
    public List<PmsBaseSaleAttr> pmsBaseSaleAttrs(){
        return pmsBaseSaleAttrService.getPmsBaseSaleAttrs();
    }

    @GetMapping("/attrInfoList")
    public List<PmsBaseAttrInfo> pmsBaseAttrInfos(@PathParam("catalog3Id") String catalog3Id){
        List<PmsBaseAttrInfo> pmsBaseAttrInfos = pmsBaseAttrInfoService.getAttrInfos(catalog3Id);
        return pmsBaseAttrInfos;
    }

    @PostMapping("/getAttrValueList")
    public List<PmsBaseAttrValue> getAttrValueList(@PathParam("attrId") String attrId){
        List<PmsBaseAttrValue> pmsBaseAttrValues= pmsBaseAttrValueService.getAttrValueList(attrId);
        return pmsBaseAttrValues;
    }

    //saveAttrInfo /saveAttrInfo
    @PostMapping("/saveAttrInfo")
    public void saveAttrInfo(@RequestBody PmsBaseAttrInfo attrInfos){
        pmsBaseAttrValueService.saveAttrInfo(attrInfos);
    }

}
