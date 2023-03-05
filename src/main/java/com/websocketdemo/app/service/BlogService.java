package com.websocketdemo.app.service;

import com.websocketdemo.app.models.Blog;
import com.websocketdemo.app.response.WebSocketResponse;

public interface BlogService {

	public WebSocketResponse createBlog(Blog blog);
	
	public WebSocketResponse getAllBlog();
}
