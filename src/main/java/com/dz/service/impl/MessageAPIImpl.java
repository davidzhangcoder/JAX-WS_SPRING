package com.dz.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.dz.common.DAOImpl;
import com.dz.configurable.Message;
import com.dz.service.api.MessageAPI;

@Transactional
public class MessageAPIImpl implements MessageAPI
{

	private DAOImpl dAOImpl;
	
	@Override
	public void persistMessage(Message message) {
		dAOImpl.save( message );

	}

	public DAOImpl getdAOImpl() {
		return dAOImpl;
	}

	public void setdAOImpl(DAOImpl dAOImpl) {
		this.dAOImpl = dAOImpl;
	}

	
	
}
