package com.quickpark.in.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.quickpark.in.model.Coordinates;
import com.quickpark.in.model.Property;
import com.quickpark.in.model.User;

@Repository ("coordinatesService")
public class CoordinatesDaoImple implements CoordinatesDao {

	@Autowired
	private JdbcTemplate jdbctemplate;

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	
	@Override
	public int saveCoordinates(Property cord,int slot, String username) {
		int cord1 = 0;
		String sql="select user_id  from user where user_name=?";
		
		User p=jdbctemplate.queryForObject(sql, new Object[]{username},new  RowMapper<User>(){

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User p1=new User();
				p1.setUserId(rs.getInt(1));
				
				return p1;
			}});
			int userid=p.getUserId();
			
		
		String sql1 = "insert into property(user_id,slot,available_status,is_deleted,longitude,latitude) values ( ?,?,?,?,?,?)";
	try {
		
	 cord1 = jdbctemplate.update(sql1, new Object[] { 
			 userid,
			  slot,
			 1,
			 1,
			 cord.getLatitude(), 
			 cord.getLongitude()});
	 //System.out.println(cord);
	 return cord1;
	
	} catch(Exception e)
		{
		System.out.println("error");
			e.printStackTrace();
			return cord1;
		}
	}

}