package com.websocketdemo.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.websocketdemo.app.models.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	public User findByUsername(String username);
}
