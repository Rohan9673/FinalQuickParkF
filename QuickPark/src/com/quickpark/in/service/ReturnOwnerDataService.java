package com.quickpark.in.service;

import com.quickpark.in.model.Coordinates;
public interface ReturnOwnerDataService {
	
	public Coordinates ownerDetails(int name);
	 int booking(Coordinates cord,String username);
}
