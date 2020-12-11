package com.gmall.service;

import com.gmall.beans.PmsBaseAttrInfo;
import com.gmall.beans.PmsBaseAttrValue;

import java.util.List;

/**
 * @author zero
 * @create 2020-11-14 19:58
 */
public interface PmsBaseAttrValueService {
    List<PmsBaseAttrValue> getAttrValueList(String attrId);

    void saveAttrInfo(PmsBaseAttrInfo attrInfos);
}
