package com.websocketdemo.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.websocketdemo.app.models.User;
import com.websocketdemo.app.response.WebSocketResponse;
import com.websocketdemo.app.service.UserService;

@CrossOrigin
@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/createUser")
	public WebSocketResponse createUser(@RequestBody User user) {
		
		return service.createUser(user);
	}
	
	@PostMapping("/login")
	public WebSocketResponse login(@RequestBody User user) {
		
		return service.getUserById(user.getUsername());
	}
}
