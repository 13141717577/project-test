package com.morhaimi.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.morhaimi.pojo.Admin;
import com.morhaimi.utils.ResponseCorrrectResult;

@RestController("admin/")
public class AdminController {
	
	@PostMapping("login/")
	public Map<String,Object> login(Admin admin){
		
		
		return ResponseCorrrectResult.Access_Success_Have_MyMsg("登陆成功");
		
	}
	
}
