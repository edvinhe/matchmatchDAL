package com.matchmatch.dalinterfaces;

import com.matchmatch.dalinterfaces.impl.SQLInsertUserSignup;
import com.matchmatch.dalinterfaces.impl.SQLQueryUserLogin;

public class SQLManagerFactory {

	private static SQLManager sqlManager = null;
	
	private SQLManagerFactory() {}
	
	public static SQLManager getInstance(String sqlActionType)
	{
		
		if (sqlActionType.equalsIgnoreCase("userSignup"))
		{
			sqlManager = new SQLInsertUserSignup();
		} else if (sqlActionType.equalsIgnoreCase("useLoginin"))
		{
			sqlManager = new SQLQueryUserLogin();
		}
		
		
		return sqlManager;
	}
}
