package com.matchmatch.test;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("UserInfoService")
public class UserInfo {

	@GET
	@Path("/name/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public User userName(@PathParam("name") String name)
	{
		User user = new User();
		user.setUsername(name);
		user.setPassword("password1!");
		
		return user;
	}
	
	@POST
	@Path("/names")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public User userNames(User user)
	{
		
		user.setUsername("Hello unknownnnn");
		
		return user;
	}
}