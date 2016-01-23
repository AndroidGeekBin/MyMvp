package com.mymvp.model.impl;

import com.mymvp.model.UserModelInterFace;

public class UserModel implements UserModelInterFace {

	@Override
	public void setUserName(String userName) {
		
	}

	@Override
	public void setUserPassword(String userPassword) {
			
	}

	@Override
	public boolean bean(String userName, String userPassword) {
		if(userName.equals("123")&&userPassword.equals("123")){
			return true;
		}
		return false;
	}

}
