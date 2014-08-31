package com.dz.service.api;

import java.util.List;

import com.dz.configurable.Group;
import com.dz.configurable.GroupUser;
import com.dz.configurable.Message;

public interface GroupAPI
{
	public void addOrUpdateGroup(Group group);

	public void addOrUpdateGroupUser(GroupUser groupUser);

	public void addOrUpdateMessageToGroupUser(GroupUser groupUser, Message message);

	public List<Message> getMessageByGroupID(int groupID);
}
