package com.websocketdemo.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.websocketdemo.app.models.Blog;

public interface BlogRepo extends JpaRepository<Blog, Integer>{

}
