package com.api.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.api.messenger.model.Message;
import com.api.messenger.service.MessageService;

@Path("/messeges")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MessegeResource {
	
	MessageService messageService = new MessageService();
	
	@GET
	public List<Message> getMesseges(){
		return messageService.getAllMesseges();
	}
	
	@POST
	public Message addMessage(Message message){
		return messageService.addMessage(message);
	}
	
	@PUT
	@Path("/{id}")
	public Message updateMessage(@PathParam("id") long id, Message message){
		message.setId(id);
		return messageService.updateMessage(message);
	}
	
	@DELETE
	@Path("/{id}")
	public Message deleteMessage(@PathParam("id") long id){
		return messageService.removeMessage(id);
	}
	
	@GET
	@Path("/{id}")
	public Message getMessage(@PathParam("id") long id){
		return messageService.getMessage(id);
	}
	
	
}
