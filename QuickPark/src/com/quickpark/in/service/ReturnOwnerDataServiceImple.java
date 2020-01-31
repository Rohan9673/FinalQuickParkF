package com.quickpark.in.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quickpark.in.dao.ReturnOwnerDataDao;
import com.quickpark.in.model.Coordinates;
@Service
public class ReturnOwnerDataServiceImple implements ReturnOwnerDataService {

	@Autowired
	private ReturnOwnerDataDao dao;
	
	@Override
	public Coordinates ownerDetails(int name) {
		// TODO Auto-generated method stub
		return dao.ownerDetails(name);
	}

	@Override
	public int booking(Coordinates cord, String username) {
		// TODO Auto-generated method stub
		
		return dao.booking(cord, username);
	}
	
}
