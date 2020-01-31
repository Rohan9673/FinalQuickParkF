package com.quickpark.in.service;

import com.quickpark.in.model.User;


public interface VehicleOwnerHomeService {
	public User selectAll();
	public int updateDetails(User p1);
	public int delete(String username);
}
