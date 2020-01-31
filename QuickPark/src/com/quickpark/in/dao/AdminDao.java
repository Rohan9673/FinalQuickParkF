package com.quickpark.in.dao;

import java.util.List;


import com.quickpark.in.model.PropertyUser;
import com.quickpark.in.model.User;

import com.quickpark.in.model.Property;

public interface AdminDao {
	List<User> selectPropertyOwner();
	List<User> selectVehicleOwner();
	List<PropertyUser> selectProperty();
	int propertyOwnerBlock( int user_id);
	int vehicleOwnerBlock( int user_id);
	

}
