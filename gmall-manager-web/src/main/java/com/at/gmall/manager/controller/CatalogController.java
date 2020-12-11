package com.at.gmall.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gmall.beans.PmsBaseCatalog1;
import com.gmall.beans.PmsBaseCatalog2;
import com.gmall.beans.PmsBaseCatalog3;
import com.gmall.service.CatalogService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @author zero
 * @create 2020-11-14 13:49
 */
@CrossOrigin
@RestController
public class CatalogController {

    @Reference
    CatalogService catalogService;


    @PostMapping("/getCatalog1")
    public List<PmsBaseCatalog1> pmsBaseCatalog1s(){
        List<PmsBaseCatalog1> pmsBaseCatalog1s = catalogService.getCatalog1s();
        return pmsBaseCatalog1s;
    }

    @PostMapping("/getCatalog2")
    public List<PmsBaseCatalog2> pmsBaseCatalog2s(@PathParam("catalog1Id") String catalog1Id){
        List<PmsBaseCatalog2> pmsBaseCatalog2s = catalogService.getCatalog2s(catalog1Id);
        return pmsBaseCatalog2s;
    }
    @PostMapping("/getCatalog3")
    public List<PmsBaseCatalog3> pmsBaseCatalog3s(@PathParam("catalog3Id") String catalog2Id){
        List<PmsBaseCatalog3> pmsBaseCatalog3s = catalogService.getCatalog3s(catalog2Id);
        return pmsBaseCatalog3s;
    }


}
