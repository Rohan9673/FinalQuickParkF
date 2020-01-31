package com.quickpark.in.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quickpark.in.dao.PropertyAvailableStatusDao;
import com.quickpark.in.model.User;

@Service
public class PropertyAvailableStatusServiceImple implements PropertyAvailableStatusService {
	
	@Autowired
	private PropertyAvailableStatusDao a;
	
	@Override
	public int propertyAvaliablesatus(int status1) {
		
		return a.propertyAvaliablesatus(status1);
	}

	@Override
	public User selectAll() {
		
		return a.selectAll();
	}

	@Override
	public int updateDetails(User p1) {
		
		return a.updateDetails(p1);
	}

	@Override
	public int delete(String username) {
		
		return a.delete(username);
	}
	
	
	



}
