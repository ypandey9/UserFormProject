package com.userform.example.com.userform.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userform.example.com.userform.example.entity.User;
import com.userform.example.com.userform.example.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
    private  UserService userService;

	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody User user){
		userService.saveUser(user);
		return new ResponseEntity<>("User register succesfully",HttpStatus.CREATED);
	}

   
}
