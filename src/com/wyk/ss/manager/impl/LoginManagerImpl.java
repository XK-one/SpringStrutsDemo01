package com.wyk.ss.manager.impl;

import com.wyk.ss.manager.LoginManager;

public class LoginManagerImpl implements LoginManager {

	@Override
	public void login(String userName, String pwd) {
		System.out.println("登陆成功"); 
	}

}
