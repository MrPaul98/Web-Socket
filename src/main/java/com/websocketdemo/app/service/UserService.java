package com.websocketdemo.app.service;

import com.websocketdemo.app.models.User;
import com.websocketdemo.app.response.WebSocketResponse;

public interface UserService {

	public WebSocketResponse createUser(User user);

	public WebSocketResponse getUserById(String username);
}
