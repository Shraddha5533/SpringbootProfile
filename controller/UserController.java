package com.springprofile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springprofile.entity.User;
import com.springprofile.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/findAllUsers")
	public List<User> findAllUsers() {
		return userService.getUser();
	}
	
	@PostMapping("/addUser")
	public String add(@RequestBody User user)
	{
		userService.addUser(user);
		return "user";
	}
}