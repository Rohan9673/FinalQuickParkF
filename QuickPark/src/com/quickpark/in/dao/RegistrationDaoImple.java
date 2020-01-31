package com.quickpark.in.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quickpark.in.model.User;

@Repository
public class RegistrationDaoImple implements RegistrationDao{

	@Autowired
	private JdbcTemplate jdbctemplate;
	
	
	@Override
	public boolean propertyRegistration(User owner) {
				
		
			String sql= "insert into user(user_name,first_name,last_name,mobile_no,email_id,address,password,role,is_deleted) values(?,?,?,?,?,?,?,?,?)";
				
				int i=jdbctemplate.update(sql, new Object[] {
					owner.getUserName(),
					owner.getFirstName(),
					owner.getLastName(),
					owner.getMobNo(),
					owner.getEmailId(),
					owner.getAddress(),
					owner.getPassword(),
					owner.getRole(),1
						
			});
			
			return true;
		}


	@Override
	public boolean vehicleRegistration(User owner) {
		String sql= "insert into user(user_name,first_name,last_name,mobile_no,email_id,address,password,role,is_deleted) values(?,?,?,?,?,?,?,?,?)";
		
		int i=jdbctemplate.update(sql, new Object[] {
			owner.getUserName(),
			owner.getFirstName(),
			owner.getLastName(),
			owner.getMobNo(),
			owner.getEmailId(),
			owner.getAddress(),
			owner.getPassword(),
			owner.getRole(),
			1
				
	});
	
	return true;
	}

	}

	
	

