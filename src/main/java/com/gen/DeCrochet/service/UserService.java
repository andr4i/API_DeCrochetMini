package com.gen.DeCrochet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gen.DeCrochet.model.User;
import com.gen.DeCrochet.repository.UserRepository;

@Service
public class UserService {
	
	
	@Autowired
	private UserRepository userRepository;
	
	// GET
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	// obtener por id
	public User getUserById(Long id) {
		return userRepository.findById(id).orElse(null);
	}
	
	// POST 
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
	// PUT 
	public User updateUser(Long id,User userD) {
		User user = userRepository.findById(id).orElse(null);
		user.setName(userD.getName());
		user.setEmail(userD.getEmail());
		user.setPhoneNumber(userD.getPhoneNumber());
		return userRepository.save(user);
	}
	
	// Delete
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
	
}
