package com.quickpark.in.dao;

import com.quickpark.in.model.Coordinates;

public interface ReturnOwnerDataDao {
	
	public Coordinates ownerDetails(int name);
	int booking(Coordinates cord,String username);

}
