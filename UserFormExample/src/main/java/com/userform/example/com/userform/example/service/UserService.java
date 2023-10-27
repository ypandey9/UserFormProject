package com.userform.example.com.userform.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.userform.example.com.userform.example.entity.User;

@Service
public class UserService {

//    private final UserRepository userRepository;
//    private final PasswordEncoder passwordEncoder;
//
////    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
////        this.userRepository = userRepository;
////        this.passwordEncoder = passwordEncoder;
////    }
////
////    public User registerUser(String username, String password) {
////        User newUser = new User();
////        newUser.setUsername(username);
////        newUser.setPassword(passwordEncoder.encode(password));
////
////        return userRepository.save(newUser);
////    }
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder; 
	
	@Autowired
	UserRepository userRepository;
	
	public void saveUser(User user)
	{
		// Hash the password before saving
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		// Save the user to the database
		userRepository.save(user);
	}
}
