package com.websocketdemo.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websocketdemo.app.models.User;
import com.websocketdemo.app.repository.UserRepo;
import com.websocketdemo.app.response.WebSocketResponse;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo repo;
	
	@Override
	public WebSocketResponse createUser(User user) {
		WebSocketResponse response =  new WebSocketResponse();
		try {
			repo.save(user);
			response.setStatus(200);
			response.setMessage("User created Sucessfully");
		} catch (Exception e) {
			response.setStatus(400);
			response.setMessage("User could not be created.");
		}
		return response;
	}

	@Override
	public WebSocketResponse getUserById(String username) {
		WebSocketResponse response =  new WebSocketResponse();
		try {
			User user =  repo.findByUsername(username);
			response.setObject(user);
			response.setStatus(200);
			response.setMessage("User login Sucessfully");
		} catch (Exception e) {
			response.setStatus(400);
			response.setMessage("User not found.");
		}
		return response;
	}

}
