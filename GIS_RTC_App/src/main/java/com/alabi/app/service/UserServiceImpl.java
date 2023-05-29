package com.alabi.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alabi.app.entity.User;
import com.alabi.app.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User createUser(User user) {//saves user to database

		return userRepository.save(user);
	}

	@Override
	public List<User> readUsers() {//fetch all user from database
		
		List<User> usersList = userRepository.findAll();
		return usersList;
	}

	@Override
	public User updateUser(User user) {//updates a user

		return userRepository.save(user);
	}

	@Override
	public void deleteUserByEmail(String email) {

		userRepository.deleteById(email);
	}

	@Override
	public User findUserByEmail(String email) {
		
		return userRepository.findById(email).get();
	}

}
