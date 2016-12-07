package com.matchmatch.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("UserInfoService")
public class UserInfo {

	@GET
	@Path("/name/{name}")
	//@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public User userName(@PathParam("name") String name)
	{
		User user = new User();
		user.setUsername(name);
		user.setPassword("password1!");
		
		return user;
	}
}