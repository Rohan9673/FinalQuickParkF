package com.quickpark.in.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quickpark.in.dao.CoordinatesDao;
import com.quickpark.in.model.Coordinates;
import com.quickpark.in.model.Property;
@Service
public class CoordinatesServiceImple implements CoordinatesService 
	{

		@Autowired
		private CoordinatesDao dao;
		
		@Override
		public int saveCoordinates(Property cord,int slot,String userName) {

			
			return dao.saveCoordinates(cord,slot,userName);
		}

		

}
