package com.quickpark.in.service;

import com.quickpark.in.model.Coordinates;
import com.quickpark.in.model.Property;



public interface CoordinatesService {
	public int saveCoordinates(Property cord,int slot,String userName);
}
