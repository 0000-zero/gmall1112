package com.at.gmall.manager.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.at.gmall.manager.mapper.PmsBaseAttrInfoMapper;
import com.at.gmall.manager.mapper.PmsBaseAttrValueMapper;
import com.gmall.beans.PmsBaseAttrInfo;
import com.gmall.beans.PmsBaseAttrValue;
import com.gmall.service.PmsBaseAttrValueService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zero
 * @create 2020-11-14 19:58
 */
@Service
public class PmsBaseAttrValueServiceImpl implements PmsBaseAttrValueService {

    @Autowired
    PmsBaseAttrValueMapper pmsBaseAttrValueMapper;

    @Autowired
    PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;

    @Override
    public List<PmsBaseAttrValue> getAttrValueList(String attrId) {
        PmsBaseAttrValue pmsBaseAttrValue = new PmsBaseAttrValue();
        pmsBaseAttrValue.setAttrId(attrId);
        pmsBaseAttrValue.setIsEnabled("1");
        List<PmsBaseAttrValue> select = pmsBaseAttrValueMapper.select(pmsBaseAttrValue);
        return select;
    }

    @Override
    public void saveAttrInfo(PmsBaseAttrInfo attrInfos) {

        pmsBaseAttrInfoMapper.insertSelective(attrInfos);

        for (PmsBaseAttrValue pmsBaseAttrValue : attrInfos.getAttrValueList()) {
            pmsBaseAttrValue.setAttrId(attrInfos.getId());
            pmsBaseAttrValueMapper.insert(pmsBaseAttrValue);
        }


    }

}
