package com.matchmatch.dalinterfaces.impl;

import com.matchmatch.dalinterfaces.SQLManager;
import com.matchmatch.pojo.User;

//用户登陆验证
public class SQLQueryUserLogin implements SQLManager{

	@Override
	public boolean validate(User user) {
		return false;
	}

}
