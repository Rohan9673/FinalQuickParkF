package com.quickpark.in.dao;

import com.quickpark.in.model.User;

public interface RegistrationDao {

	

	boolean propertyRegistration(User owner);

	boolean vehicleRegistration(User owner);

}
