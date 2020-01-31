package com.quickpark.in.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.quickpark.in.model.Coordinates;



@Repository
public class ReturnCoordinatesDaoImple implements ReturnCoordinatesDao {

	@Autowired
	private JdbcTemplate jdbctemplate;

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
		System.out.println("In jdbc template");
	}

	@Override
	public List<Coordinates> list1() {
		// TODO Auto-generated method stub
		
		String sql = "select * from property";
		
		List<Coordinates> list2 = jdbctemplate.query(sql, new RowMapper<Coordinates>() {

			
			@Override
			public Coordinates mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				
				Coordinates cord1 = new Coordinates();
				
				cord1.setLatitude(rs.getString(6));
				cord1.setLongitude(rs.getString(7));
				cord1.setName(rs.getInt(1));
				
				return cord1;
			}
			
		});
		return list2;
	}




}