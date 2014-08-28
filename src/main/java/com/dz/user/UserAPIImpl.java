package com.dz.user;

import org.springframework.transaction.annotation.Transactional;

import com.dz.common.DAOImpl;
import com.dz.configurable.User;
import com.dz.user.api.UserAPI;

@Transactional
public class UserAPIImpl implements UserAPI 
{

	private DAOImpl dAOImpl;
	
	@Override
	public void persistUser( User user )
	{

		dAOImpl.save( user );
	}

	public DAOImpl getdAOImpl() {
		return dAOImpl;
	}

	public void setdAOImpl(DAOImpl dAOImpl) {
		this.dAOImpl = dAOImpl;
	}

}
