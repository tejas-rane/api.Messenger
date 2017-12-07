package com.api.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/messeges")
public class MessegeResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMesseges(){
		return "Hello World";
	}
}
