package com.dz.service.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.dz.configurable.Message;

@WebService(name = "MessageWebService", targetNamespace = "http://dz.com/")
@SOAPBinding(style=Style.DOCUMENT)

public interface MessageService
{
	@WebMethod
	public void addOrUpdateMessage( @WebParam(name="message") Message message );
	

}