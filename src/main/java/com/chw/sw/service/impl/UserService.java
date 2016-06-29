package com.chw.sw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chw.sw.dao.SysUserMapper;
import com.chw.sw.entity.SysUser;

@Service
public class UserService {
	
	@Autowired
	SysUserMapper userMapper;
	
	
	public SysUser getSysUserByid(long id){
		return userMapper.selectByPrimaryKey(id);
	}
	
	public List<SysUser> getAllUser(){
		return userMapper.getAllUser();
	}
	
}
