package com.chw.sw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chw.sw.dao.SysUserMapper;
import com.chw.sw.service.impl.UserService;

@Controller
public class IndexController {
	
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/getUser")
	@ResponseBody
	public Object getUser(Long id){
		return userService.getSysUserByid(id);
	}
	@RequestMapping("/index")
	@ResponseBody
	public Object index(){
		return "hello world";
	}
	
	@RequestMapping("/toindex")
	public Object toindex(){
		return "login";
	}
	
	
	@RequestMapping("/getAllUser")
	@ResponseBody
	public List getAllUser(){
		return userService.getAllUser();
	}
	
}
