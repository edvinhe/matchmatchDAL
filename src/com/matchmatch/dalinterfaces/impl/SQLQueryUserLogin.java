package com.matchmatch.dalinterfaces.impl;

import com.matchmatch.dalinterfaces.SQLManager;
import com.matchmatch.pojo.User;

//�û���½��֤
public class SQLQueryUserLogin implements SQLManager{

	@Override
	public boolean validate(User user) {
		return false;
	}

}
