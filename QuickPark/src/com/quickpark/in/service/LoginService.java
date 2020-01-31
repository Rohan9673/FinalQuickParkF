package com.quickpark.in.service;

import org.springframework.stereotype.Service;

import com.quickpark.in.model.User;

@Service
public interface LoginService {

	User validateUser(User log);
	
	
	

}
