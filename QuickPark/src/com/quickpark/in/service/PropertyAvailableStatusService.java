package com.quickpark.in.service;


import com.quickpark.in.model.User;

public interface PropertyAvailableStatusService {
	public int propertyAvaliablesatus(int status1);
	public User selectAll();
	public int updateDetails(User p1);
	public int delete(String username);
	
}
