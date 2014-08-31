package com.dz.service.impl;

import java.util.List;

import com.dz.common.DAOImpl;
import com.dz.configurable.Group;
import com.dz.configurable.GroupUser;
import com.dz.configurable.Message;
import com.dz.service.api.GroupAPI;

public class GroupAPIImpl implements GroupAPI
{
	
	private DAOImpl dAOImpl;

	@Override
	public void addOrUpdateGroup(Group group) {

	}

	@Override
	public void addOrUpdateGroupUser(GroupUser groupUser) {

	}

	@Override
	public void addOrUpdateMessageToGroupUser(GroupUser groupUser,
			Message message) {

	}

	@Override
	public List<Message> getMessageByGroupID(int groupID) {
		return null;
	}

	public DAOImpl getdAOImpl() {
		return dAOImpl;
	}

	public void setdAOImpl(DAOImpl dAOImpl) {
		this.dAOImpl = dAOImpl;
	}
	
	

}
