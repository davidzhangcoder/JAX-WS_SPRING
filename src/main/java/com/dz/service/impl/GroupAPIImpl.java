package com.dz.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.SessionFactoryUtils;
import org.springframework.transaction.annotation.Transactional;

import com.dz.common.DAOImpl;
import com.dz.common.HibernateUtil;
import com.dz.configurable.Group;
import com.dz.configurable.GroupUser;
import com.dz.configurable.Message;
import com.dz.service.api.GroupAPI;

@Transactional
public class GroupAPIImpl implements GroupAPI
{
	
	private DAOImpl dAOImpl;

	@Override
	public void addOrUpdateGroup(Group group) {
		dAOImpl.save(group);
	}

	@Override
	public void addOrUpdateGroupUser(GroupUser groupUser) {
		dAOImpl.save(groupUser);
	}

	@Override
	public void addOrUpdateMessageToGroupUser(GroupUser groupUser,
			Message message) {

	}

	@Override
	public List<Message> getMessageByGroupID(int groupID)
	{
		
		List<Message> list = new ArrayList<Message>();
		
		Message message = dAOImpl.get(Message.class, groupID);
		
//		message.getUser().getMessages();
//		 
//		System.out.println( message.getUser().getMessages().size() );
		
		return list;
	}

	
	public DAOImpl getdAOImpl() {
		return dAOImpl;
	}

	public void setdAOImpl(DAOImpl dAOImpl) {
		this.dAOImpl = dAOImpl;
	}
	
	

}
