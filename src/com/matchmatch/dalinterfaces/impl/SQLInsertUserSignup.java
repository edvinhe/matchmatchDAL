package com.matchmatch.dalinterfaces.impl;

import com.matchmatch.dalinterfaces.SQLManager;
import com.matchmatch.pojo.User;

//�û�ע����Ϣ
public class SQLInsertUserSignup implements SQLManager {

	@Override
	public boolean validate(User user) {
		
		return false;
	}

}
