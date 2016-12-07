package com.matchmatch.test;

public class User {
	
	private String username;
	private String password;
	
	public String getUsername()
	{
		return this.username;
	}
	public String getPassword()
	{
		return this.password;
	}
	
	public void setUsername(String name)
	{
		this.username = name;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	@Override
	public String toString()
	{
		return "username = " + username +", password = " + password; 
	}

}
