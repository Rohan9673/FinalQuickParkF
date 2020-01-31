package com.quickpark.in.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quickpark.in.dao.AdminDao;
import com.quickpark.in.model.PropertyUser;
import com.quickpark.in.model.User;
import com.quickpark.in.model.Property;


public interface AdminHomeService {
	List<PropertyUser> selectProperty();
	List<User> selectPropertyOwner();
	List<User> selectVehicleOwner();
	int propertyOwnerBlock( int user_id);
	int vehicleOwnerBlock( int user_id);
	void acceptRequest();
	
}
