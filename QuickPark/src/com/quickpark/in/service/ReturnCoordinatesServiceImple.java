package com.quickpark.in.service;

import com.quickpark.in.dao.ReturnCoordinatesDao;
import com.quickpark.in.model.Coordinates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ReturnCoordinatesServiceImple implements ReturnCoordinatesService {

	@Autowired
	private ReturnCoordinatesDao dao;

	@Override
	public List<Coordinates> list() {
		//System.out.println("In Returncoordserviceimple");

		
		return dao.list1();
	}

	
}
