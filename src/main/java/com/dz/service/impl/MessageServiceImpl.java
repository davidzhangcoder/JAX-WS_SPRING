package com.dz.service.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.dz.configurable.Message;
import com.dz.service.api.MessageService;


@WebService(targetNamespace = "http://dz.com/",
portName = "MessageServiceImplPort",
serviceName = "MessageServiceImpl")
public class MessageServiceImpl implements MessageService
{
	
	private MessageAPIImpl messageAPIImpl;

	public MessageAPIImpl getMessageAPIImpl() {
		return messageAPIImpl;
	}

	public void setMessageAPIImpl(MessageAPIImpl messageAPIImpl) {
		this.messageAPIImpl = messageAPIImpl;
	}

	@Override
	@WebMethod
	public void addOrUpdateMessage( @WebParam(name="message") Message message )
	{
		messageAPIImpl.persistMessage(message);
	}

}
