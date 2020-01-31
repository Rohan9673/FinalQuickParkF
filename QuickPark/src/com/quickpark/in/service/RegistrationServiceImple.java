package com.quickpark.in.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.quickpark.in.dao.RegistrationDao;
import com.quickpark.in.model.User;

@Service
public class RegistrationServiceImple implements RegistrationService{

	@Autowired
	RegistrationDao registrationdao;
	
	@Autowired
	JdbcTemplate jdbctemplate;
	
	@Override
	public boolean propertRegister(User owner) {
		
			
		return registrationdao.propertyRegistration(owner);
	}

	@Override
	public boolean vehicleRegister(User owner) {
		
		return registrationdao.vehicleRegistration(owner);
	}

public boolean isUsername(String username) {
		
	System.out.println("more");
		String sql = "select count(user_name) from user where user_name=?";
		Integer count = jdbctemplate.queryForObject(sql,new Object[] {username}, Integer.class);
		if(count == 1)
			return true;
		else
				return false;
	}
}
