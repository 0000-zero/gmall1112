package com.at.gmall.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.at.gmall.manager.util.UploadUtil;
import com.gmall.beans.PmsProductInfo;
import com.gmall.service.SupService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @author zero
 * @create 2020-11-14 19:49
 */
@CrossOrigin
@RestController
public class SpuController {

    @Reference
    SupService supService;

    //saveSpuInfo
    @RequestMapping("/saveSpuInfo")
    public void saveSpuInfo(@RequestBody PmsProductInfo pmsProductInfo){

        supService.saveSpuInfo(pmsProductInfo);

        System.out.println("spu信息 保存成功");

    }

    //fileUpload
    @RequestMapping("/fileUpload")
    public String fileUpload(@PathParam("file")MultipartFile file){

        String url = new UploadUtil().uploadImages(file);

        return url;
    }


    //http://127.0.0.1:6001/spuList?catalog3Id=61
    @RequestMapping("/spuList")
    public List<PmsProductInfo> getSpuList(@PathParam("cangtalog3Id") String catalog3Id){
        List<PmsProductInfo> pmsProductInfos = supService.getSpuList(catalog3Id);
        return pmsProductInfos;
    }




}
