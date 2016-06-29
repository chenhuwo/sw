package com.chw.sw.dao;

import java.util.List;
import java.util.Map;

import com.chw.sw.entity.SysUser;

public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
    
    List<SysUser> getAllUser();
    
    List<Map<String, Object>> listgetAllUser();
}