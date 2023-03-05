package com.websocketdemo.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websocketdemo.app.models.Blog;
import com.websocketdemo.app.repository.BlogRepo;
import com.websocketdemo.app.response.WebSocketResponse;

@Service
public class BlogServiceImpl implements BlogService{

	@Autowired
	private BlogRepo repo;
	@Override
	public WebSocketResponse createBlog(Blog blog) {
		WebSocketResponse response =  new WebSocketResponse();
		try {
			repo.save(blog);
			response.setStatus(200);
			response.setMessage("Blog created Sucessfully");
		} catch (Exception e) {
			response.setStatus(400);
			response.setMessage("Blog could not be created.");
		}
		return response;
	}

	@Override
	public WebSocketResponse getAllBlog() {
		WebSocketResponse response =  new WebSocketResponse();
		try {
			List<Blog> blogList = repo.findAll();
			response.setObject(blogList);
			response.setStatus(200);
			response.setMessage("Blog found Sucessfully");
		} catch (Exception e) {
			response.setStatus(400);
			response.setMessage("Blog not found.");
		}
		return response;
	}

}
