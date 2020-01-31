package com.quickpark.in.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;



import com.quickpark.in.model.PropertyUser;
import com.quickpark.in.model.User;

import com.quickpark.in.model.Property;

@Repository
public class AdminDaoImple implements AdminDao {

	@Autowired
	private JdbcTemplate jdbctemplate;
	
	
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	@Override
	public List<User> selectPropertyOwner() {
	
		List<User> list = new ArrayList<>();	
		String sql="select * from user where role='propertyowner'";	
		list=jdbctemplate.query(sql, new RowMapper<User>() {
	      		
				@Override
				public User mapRow(ResultSet rs, int rowNum) throws SQLException {			
					User p=new User();
					p.setUserId(rs.getInt(1));
					p.setIsDeleted(rs.getInt(10));
					p.setFirstName(rs.getString(3));
					p.setLastName(rs.getString(4));
					p.setMobNo(Long.parseLong(rs.getString(5)));
					p.setEmailId(rs.getString(6));
							
					return p;
					
				}	
				
			});
	
		return list;
	}
	
	@Override
	public List<User> selectVehicleOwner() {
	
		List<User> list = new ArrayList<>();	
		String sql="select * from user where role='vehicleowner'";	
		list=jdbctemplate.query(sql, new RowMapper<User>() {
	      		
				@Override
				public User mapRow(ResultSet rs, int rowNum) throws SQLException {			
					User p=new User();
					p.setUserId(rs.getInt(1));
					p.setFirstName(rs.getString(3));
					p.setLastName(rs.getString(4));
					p.setMobNo(Long.parseLong(rs.getString(5)));
					p.setEmailId(rs.getString(6));
					p.setIsDeleted(rs.getInt(10));		
					return p;
					
				}	
				
			});
	
		return list;
	}


	@Override
	public List<PropertyUser> selectProperty() {
		List<PropertyUser> li=new ArrayList<>();
		String sql="SELECT  user.first_name, user.last_name, property.latitude, property.longitude, property.available_status, property.is_deleted "
				+ "from user INNER JOIN property ON user.user_id = property.user_id";
		
		
		
		
		li=jdbctemplate.query(sql, new RowMapper<PropertyUser>() {
      		
			@Override
			public PropertyUser mapRow(ResultSet rs, int rowNum) throws SQLException {			
				PropertyUser p=new PropertyUser();
				p.setFirst_name(rs.getString("first_name"));
				p.setLast_name(rs.getString("last_name"));
				p.setLat(rs.getString("latitude"));
				p.setLongitude(rs.getString("longitude"));
				p.setAvailable_status(rs.getInt("available_status"));
				p.setIs_deleted(rs.getInt("is_deleted"));
						
				return p;
				
			}	
			
		});

	return li;
		
}


	@Override
	public int propertyOwnerBlock(int user_id) {
		
		     String sql1="update user set is_deleted=? where user_id=?";
			String sql2="update property set is_deleted=? where user_id=?";
			System.out.println("user_id"+user_id);
			int i=0;
			
			try {
				
				 i=jdbctemplate.update(sql1, new Object[] {0,user_id});
				
				 
				 i=jdbctemplate.update(sql2, new Object[] {0,user_id});
				
				}
				catch(Exception e)
				{
					
				}
				
			
			
			return i;
		}


	@Override
	public int vehicleOwnerBlock(int user_id) {
		String sql1="update user set is_deleted=? where user_id=? and role='vehicleowner'";
		
		
		int i=0;
		
		try {
			
			 i=jdbctemplate.update(sql1, new Object[] {0,user_id});
			
			}
			catch(Exception e)
			{
				
			}
			
		
		
		return i;
	}

	}
	



	

