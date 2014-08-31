package com.dz.service.api;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.dz.configurable.Group;
import com.dz.configurable.GroupUser;
import com.dz.configurable.Message;


@WebService(name = "GroupWebService", targetNamespace = "http://dz.com/")
@SOAPBinding(style=Style.DOCUMENT)
public interface GroupService
{
	
	@WebMethod
	public void addOrUpdateGroup( @WebParam(name="group") Group group );

	
	@WebMethod
	public void addOrUpdateGroupUser( @WebParam(name="groupUser") GroupUser groupUser);

	
	@WebMethod
	public void addOrUpdateMessageToGroupUser( @WebParam(name="groupUser") GroupUser groupUser ,  @WebParam(name="message") Message message );

	@WebMethod
	public List<Message> getMessageByGroupID( @WebParam(name="groupID") int groupID );

}
