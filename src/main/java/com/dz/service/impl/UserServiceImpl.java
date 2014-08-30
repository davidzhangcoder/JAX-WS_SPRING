package com.dz.service.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.dz.configurable.User;
import com.dz.service.api.UserAPI;
import com.dz.service.api.UserService;


@WebService(targetNamespace = "http://dz.com/",
		portName = "UserServiceImplPort",
		serviceName = "UserServiceImplService")
public class UserServiceImpl implements UserService
{

	private UserAPIImpl userAPIImpl; 
	
	@Override
	@WebMethod
	public void addOrUpdateUser( @WebParam(name = "user") User user )
	{
		userAPIImpl.persistUser(  user );
	}
	
	@Override
	@WebMethod
	public User login( @WebParam(name = "user") User user )
	{
		return null;
	}


	public UserAPIImpl getUserAPIImpl() {
		return userAPIImpl;
	}

	public void setUserAPIImpl(UserAPIImpl userAPIImpl) {
		this.userAPIImpl = userAPIImpl;
	}








	
	
}
