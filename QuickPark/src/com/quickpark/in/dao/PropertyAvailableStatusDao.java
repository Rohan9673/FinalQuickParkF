package com.quickpark.in.dao;


import com.quickpark.in.model.User;

public interface PropertyAvailableStatusDao {
	public int propertyAvaliablesatus(int status1);
	public User selectAll();
	public int updateDetails(User p1);
	public int delete(String username);
	
}
