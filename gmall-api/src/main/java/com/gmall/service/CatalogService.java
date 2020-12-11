package com.gmall.service;

import com.gmall.beans.PmsBaseCatalog1;
import com.gmall.beans.PmsBaseCatalog2;
import com.gmall.beans.PmsBaseCatalog3;

import java.util.List;

/**
 * @author zero
 * @create 2020-11-14 14:14
 */
public interface CatalogService {
    List<PmsBaseCatalog1> getCatalog1s();

    List<PmsBaseCatalog2> getCatalog2s(String catalog1Id);

    List<PmsBaseCatalog3> getCatalog3s(String catalog2Id);
}
