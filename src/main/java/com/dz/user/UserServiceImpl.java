package com.dz.user;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.dz.configurable.User;
import com.dz.user.api.UserAPI;
import com.dz.user.api.UserService;


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
		User newUser = new User();
		
//		newUser.setID(1);
		newUser.setUserName("david");
		
		userAPIImpl.persistUser();
	}

	public UserAPIImpl getUserAPIImpl() {
		return userAPIImpl;
	}

	public void setUserAPIImpl(UserAPIImpl userAPIImpl) {
		this.userAPIImpl = userAPIImpl;
	}








	
	
}
