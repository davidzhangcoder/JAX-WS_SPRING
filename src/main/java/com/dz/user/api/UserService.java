package com.dz.user.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.dz.configurable.User;

@WebService(name = "UserWebService", targetNamespace = "http://dz.com/")
@SOAPBinding(style=Style.DOCUMENT)

public interface UserService
{
	@WebMethod
	public void addOrUpdateUser( @WebParam(name="user") User user);
}
