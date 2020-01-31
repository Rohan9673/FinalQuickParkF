package com.quickpark.in.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.quickpark.in.dao.VehicleOwnerHomeDao;
import com.quickpark.in.model.User;

@Service
public class VehicleOwnerHomeServiceImple  implements VehicleOwnerHomeService{
	
	@Autowired
	VehicleOwnerHomeDao dao;
	@Override
	public User selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public int updateDetails(User p1) {
		// TODO Auto-generated method stub
		return dao.updateDetails(p1);
	}

	@Override
	public int delete(String username) {
		// TODO Auto-generated method stub
		return dao.delete(username);
	}

}
