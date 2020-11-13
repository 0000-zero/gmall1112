package com.at.gmall.gmalluser.mapper;

import com.gmall.beans.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author zero
 * @create 2020-11-12 20:08
 */
//Mapper<UmsMember>
    // BaseMapper<UmsMember>
//@Mapper
public interface UmsMemberMapper extends Mapper<UmsMember> {
    List<UmsMember> getAllMember();

}
