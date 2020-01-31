package com.quickpark.in.service;

import com.quickpark.in.model.User;

public interface RegistrationService {

	boolean propertRegister(User owner);

	boolean vehicleRegister(User owner);
	public boolean isUsername(String username);

}
