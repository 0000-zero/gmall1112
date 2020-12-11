package com.at.gmall.manager.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.at.gmall.manager.mapper.PmsBaseAttrInfoMapper;
import com.at.gmall.manager.mapper.PmsBaseAttrValueMapper;
import com.gmall.beans.PmsBaseAttrInfo;
import com.gmall.service.PmsBaseAttrInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zero
 * @create 2020-11-14 19:25
 */
@Service
public class PmsBaseAttrInfoServiceImpl implements PmsBaseAttrInfoService {

    @Autowired
    PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;

    @Autowired
    PmsBaseAttrValueMapper pmsBaseAttrValueMapper;

    @Override
    public List<PmsBaseAttrInfo> getAttrInfos(String catalog3Id) {

        PmsBaseAttrInfo pmsBaseAttrInfo = new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalog3Id);
        pmsBaseAttrInfo.setIsEnabled("1");
        List<PmsBaseAttrInfo> select = pmsBaseAttrInfoMapper.select(pmsBaseAttrInfo);
//        if(select != null && select.size() > 0){
//            select = select.stream().map(item -> {
//
//                PmsBaseAttrValue pmsBaseAttrValue  = new PmsBaseAttrValue();
//                pmsBaseAttrValue.setAttrId(item.getId());
//                List<PmsBaseAttrValue> select1 = pmsBaseAttrValueMapper.select(pmsBaseAttrValue);
//                item.setAttrValueList(select1);
//
//                return item;
//            }).collect(Collectors.toList());
//        }

        return select;
    }
}
