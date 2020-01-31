package com.quickpark.in.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quickpark.in.dao.LoginDao;
import com.quickpark.in.model.User;

@Service
public class LoginServiceImple implements LoginService {

	@Autowired
	LoginDao logindao;
	
	
	@Override
	public User validateUser(User log) {
		
		
		return logindao.validateUser(log);
	}

}
