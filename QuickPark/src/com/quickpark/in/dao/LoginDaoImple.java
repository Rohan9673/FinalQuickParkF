package com.quickpark.in.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.quickpark.in.model.User;

@Repository
public class LoginDaoImple implements LoginDao{

	@Autowired
	private JdbcTemplate jdbctemplate;
	
	
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	

	
	@Override
	public User validateUser(User login) {
		
		
		User user=null;
		 
      	String sql = "select * from user where user_name=? and password=? and is_deleted=1";
      		User log=new User();
	try {
		user=jdbctemplate.queryForObject(sql, new Object[]{login.getUserName(),login.getPassword()}, new RowMapper<User>() {
      		
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				User log=new User();
				log.setUserName(rs.getString(2));
				log.setPassword(rs.getString(8));
				log.setRole(rs.getString(9));
				
				
					return log;
				}	
			});
	}catch(Exception e)
	{
		log=null;
		user= log;
	}
      		   
		return user;
	
}

		
		
	

}
