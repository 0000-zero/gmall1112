package com.at.gmall.manager.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.at.gmall.manager.mapper.Catalog1Mapper;
import com.at.gmall.manager.mapper.Catalog2Mapper;
import com.at.gmall.manager.mapper.Catalog3Mapper;
import com.gmall.beans.PmsBaseCatalog1;
import com.gmall.beans.PmsBaseCatalog2;
import com.gmall.beans.PmsBaseCatalog3;
import com.gmall.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zero
 * @create 2020-11-14 14:15
 */
@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    Catalog1Mapper catalog1Mapper;
    @Autowired
    Catalog2Mapper catalog2Mapper;
    @Autowired
    Catalog3Mapper catalog3Mapper;





    @Override
    public List<PmsBaseCatalog1> getCatalog1s() {
        List<PmsBaseCatalog1> pmsBaseCatalog1s = catalog1Mapper.selectAll();

        return pmsBaseCatalog1s;
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2s(String catalog1Id) {

        PmsBaseCatalog2 pmsBaseCatalog2 = new PmsBaseCatalog2();
        pmsBaseCatalog2.setCatalog1Id(catalog1Id);
        List<PmsBaseCatalog2> select = catalog2Mapper.select(pmsBaseCatalog2);

        return select;
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3s(String catalog2Id) {
        PmsBaseCatalog3 pmsBaseCatalog3  =new PmsBaseCatalog3();
        pmsBaseCatalog3.setCatalog2Id(catalog2Id);

        List<PmsBaseCatalog3> select = catalog3Mapper.select(pmsBaseCatalog3);

        return select;
    }
}
