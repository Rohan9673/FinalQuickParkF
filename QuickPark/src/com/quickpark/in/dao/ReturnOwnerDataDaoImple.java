
package com.quickpark.in.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.quickpark.in.model.Coordinates;
import com.quickpark.in.model.User;

@Repository
public class ReturnOwnerDataDaoImple implements ReturnOwnerDataDao {

	@Autowired
	private JdbcTemplate jdbctemplate;

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
		System.out.println("In details template");
	}

	@SuppressWarnings("unchecked")
	@Override
	public Coordinates ownerDetails(int name) {

		String sql = "select * from property where address_id =?";

		// System.out.println("dddd"+name);
		Coordinates p = null;
		try {
			p = jdbctemplate.queryForObject(sql, new Object[] { name }, new RowMapper<Coordinates>() {

				@Override
				public Coordinates mapRow(ResultSet rs, int rowNum) throws SQLException {
					Coordinates p1 = new Coordinates();
					p1.setLatitude(rs.getString("latitude"));
					p1.setLongitude(rs.getString("longitude"));
					p1.setName(rs.getInt("address_id"));
					return p1;

				}
			});
			// System.out.println(p.getName());
		} catch (Exception e) {

		}
		return p;

	}

	@SuppressWarnings("unchecked")
	@Override
	public int booking(Coordinates cord, String username) {
		String sql="select user_id from user where user_name=? ";
		String sql1="insert into vehicle(user_id,type_of_vehicle,vehicle_no,is_deleted) values(?,?,?,?)";
		String sql2="insert into booking(address_id,vehicle_no,arrival_time,arrivale_date,departure_time,departure_date) values(?,?,?,?,?,?)";
		//String sql3="select * from vehicle where vehicle_no=?";
		User p=null;
		int i=0;
		
		
		
		
		
		try 
		 {
			p=jdbctemplate.queryForObject(sql, new Object[]{username},new  RowMapper<User>(){
			
				@Override
				public User mapRow(ResultSet rs, int rowNum) throws SQLException {
					User p1=new User();
					p1.setUserId(rs.getInt(1));
					return p1;
				}});
			
			 			 
	
				 System.out.println(p.getUserId());
			 i=jdbctemplate.update(sql1, new Object[] {
					p.getUserId(),
					cord.getType(),
					cord.getVehicle_no(),
				       1
			 });
			 
			 
			 i=jdbctemplate.update(sql2, new Object[] {
					 107,
					 cord.getVehicle_no(),
					 cord.getArrival_time(),
					 cord.getArrivale_date(),
					 cord.getDeparture_time(),
					 cord.getDeparture_date()
			 });
		
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		 
		
		return i;
	}
}
