package com.quickpark.in.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quickpark.in.dao.AdminDao;
import com.quickpark.in.model.PropertyUser;
import com.quickpark.in.model.User;
import com.quickpark.in.model.Property;

@Service
public class AdminHomeServiceImple implements AdminHomeService{

	@Autowired
	AdminDao admindao;
	
	
	@Override
	public List<User> selectPropertyOwner() {
		
		return admindao.selectPropertyOwner();
	}


	@Override
	public void acceptRequest() {
		
		
		
	}


	@Override
	public List<User> selectVehicleOwner() {
		
		return admindao.selectVehicleOwner();
	}


	@Override
	public List<PropertyUser> selectProperty() {
		
		return admindao.selectProperty();
	}


	@Override
	public int propertyOwnerBlock(int user_id) {
		// TODO Auto-generated method stub
		return admindao.propertyOwnerBlock(user_id);
	}


	@Override
	public int vehicleOwnerBlock(int user_id) {
		
		return admindao.vehicleOwnerBlock(user_id);
	}
	

}
