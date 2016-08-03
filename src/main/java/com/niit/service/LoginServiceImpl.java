package com.niit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.LoginDAO;
import com.niit.model.User;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO ld;
	
	@Override
	public boolean checkUser(User u) 
	{
		boolean b=false;
		b=ld.checkUser(u);
		if(b==true){
			b=true;
		}
		return b;
	}


}
