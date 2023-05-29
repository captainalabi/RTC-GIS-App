package com.alabi.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alabi.app.entity.User;
import com.alabi.app.repository.UserRepository;

@Service
public interface UserService {

	User createUser(User user);
	
	List<User> readUsers();
	
	User updateUser(User user);
	
	void deleteUserByEmail(String email);
	
	User findUserByEmail(String email);
}
