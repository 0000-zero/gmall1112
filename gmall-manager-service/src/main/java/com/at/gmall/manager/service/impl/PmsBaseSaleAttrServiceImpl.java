package com.at.gmall.manager.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.at.gmall.manager.mapper.PmsBaseSaleAttrMapper;
import com.gmall.beans.PmsBaseSaleAttr;
import com.gmall.service.PmsBaseSaleAttrService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zero
 * @create 2020-11-14 22:52
 */
@Service
public class PmsBaseSaleAttrServiceImpl implements PmsBaseSaleAttrService {

    @Autowired
    PmsBaseSaleAttrMapper pmsBaseSaleAttrMapper;

    @Override
    public List<PmsBaseSaleAttr> getPmsBaseSaleAttrs() {

        return pmsBaseSaleAttrMapper.selectAll();
    }
}
