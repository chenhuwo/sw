package com.chw.sw.Mapper;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chw.sw.dao.SysUserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-bean.xml")
public class UserMapperTest {
	
	@Autowired
	private SysUserMapper userMapper;


	
	@Test
	public void testGetList(){
		List<Map<String, Object>> list = userMapper.listgetAllUser();
		for (Map<String, Object> map : list) {
			System.out.println(map);
		}
	}
	
}
