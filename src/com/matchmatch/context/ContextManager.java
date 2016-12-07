package com.matchmatch.context;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.matchmatch.dalinterfaces.SQLManager;
import com.matchmatch.dalinterfaces.SQLManagerFactory;
import com.matchmatch.pojo.User;

@Path("dal")
public class ContextManager {

	@POST
	@Path("/user/signup")
	@Consumes(MediaType.APPLICATION_JSON)
	public String userSignup(User user)
	{
		
		SQLManager sqlManager = SQLManagerFactory.getInstance("userSignup");
		if(sqlManager.validate(user))
		{
			
		}
		else
		{
			user.setUsername("edvinnnnnnnnn");
		}
		System.out.println("User=============>"+user.getUsername());
		
		return "Good";
	}
	
}
