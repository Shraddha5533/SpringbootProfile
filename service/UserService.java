package com.springprofile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.springprofile.entity.User;
import com.springprofile.repository.UserRepository;

@Service

public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getUser() {
		return userRepository.findAll();
	}
	
	public void addUser(User user)
	{
		userRepository.save(user);
	}
}