package com.aloner2019.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aloner2019.pojo.User;
import com.aloner2019.service.UserService;
import com.aloner2019.utils.StarJSONResult;

@RestController
public class UserController extends BaseController {

	@Autowired
	UserService userService;

	@GetMapping("/register")
	public StarJSONResult register() {
		User user = new User();
		String nickname = "test01";
		String username = "test01";
		String password = "test01";
		user.setNickname(nickname);
		user.setUsername(username);
		user.setPassword(password);
		user.setCreateAt(new Date());
		userService.saveUser(user);
		return StarJSONResult.ok(user);
	}
}
