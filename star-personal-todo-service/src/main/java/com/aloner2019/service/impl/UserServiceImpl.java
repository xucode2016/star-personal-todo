package com.aloner2019.service.impl;

import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aloner2019.mapper.UserMapper;
import com.aloner2019.pojo.User;
import com.aloner2019.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private Sid sid;
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void saveUser(User user) {
		String userId = sid.nextShort();
		user.setId(userId);
		userMapper.insert(user);
	}

}
