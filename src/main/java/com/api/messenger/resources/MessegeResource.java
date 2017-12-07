package com.api.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.api.messenger.model.Message;
import com.api.messenger.service.MessageService;

@Path("/messeges")
public class MessegeResource {
	
	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMesseges(){
		return messageService.getAllMesseges();
	}
}
