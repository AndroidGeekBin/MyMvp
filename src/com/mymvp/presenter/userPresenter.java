package com.mymvp.presenter;

import com.mymvp.model.UserModelInterFace;
import com.mymvp.model.impl.UserModel;
import com.mymvp.view.userView;

public class userPresenter {
		private userView view;
		private UserModelInterFace userModelInterFace;
		public userPresenter(userView view ) {
			super();
			this.view = view;
			userModelInterFace = new UserModel();
		}
		
		public boolean login(String name,String password){
		boolean bool =	userModelInterFace.bean(name, password);
		
		return bool;
		}
		
}
