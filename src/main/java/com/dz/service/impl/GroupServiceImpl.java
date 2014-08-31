package com.dz.service.impl;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.dz.configurable.Group;
import com.dz.configurable.GroupUser;
import com.dz.configurable.Message;
import com.dz.service.api.GroupService;

@WebService(targetNamespace = "http://dz.com/",
portName = "GroupServiceImplPort",
serviceName = "GroupServiceImplService")
public class GroupServiceImpl implements GroupService
{

	@Override
	@WebMethod
	public void addOrUpdateGroup(@WebParam(name="group") Group group)
	{

	}

	@Override
	@WebMethod
	public void addOrUpdateGroupUser(@WebParam(name="groupUser") GroupUser groupUser)
	{

	}

	@Override
	@WebMethod
	public void addOrUpdateMessageToGroupUser( @WebParam(name="groupUser") GroupUser groupUser ,  @WebParam(name="message") Message message )
	{

	}

	@Override
	@WebMethod
	public List<Message> getMessageByGroupID(@WebParam(name="groupID") int groupID)
	{
		return null;
	}

}
