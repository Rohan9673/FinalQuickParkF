package com.quickpark.in.dao;

import com.quickpark.in.model.Coordinates;
import com.quickpark.in.model.Property;

public interface CoordinatesDao {
	public int saveCoordinates(Property cord,int slot,String userName);
}
