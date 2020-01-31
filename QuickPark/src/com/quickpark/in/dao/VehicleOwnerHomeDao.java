package com.quickpark.in.dao;

import com.quickpark.in.model.User;


public interface VehicleOwnerHomeDao {
	public User selectAll();
	public int updateDetails(User p1);
	public int delete(String username);
}
