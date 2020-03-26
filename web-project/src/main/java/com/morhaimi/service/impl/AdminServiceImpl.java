package com.morhaimi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.morhaimi.mapper.AdminMapper;
import com.morhaimi.pojo.Admin;
import com.morhaimi.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminMapper adminMpp;

	@Override
	public Admin login(Admin admin) {
		return adminMpp.queryByAdmin(admin);
	}

}
