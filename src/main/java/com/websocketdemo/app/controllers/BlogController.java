package com.websocketdemo.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.websocketdemo.app.models.Blog;
import com.websocketdemo.app.response.WebSocketResponse;
import com.websocketdemo.app.service.BlogService;

@CrossOrigin
@RestController
public class BlogController {

	@Autowired
	private BlogService blogService;
	
	@PostMapping("/createBlog")
	public WebSocketResponse createBlog(@RequestBody Blog blog) {
		
		return blogService.createBlog(blog);
	}
	
	@GetMapping("/getAllBlog")
	public WebSocketResponse getAllBlog() {
		return blogService.getAllBlog();
	}
}
