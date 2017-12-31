package com.api.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.api.messenger.database.DatabaseClass;
import com.api.messenger.model.Message;

public class MessageService {
	private static Map<Long, Message> messeges = DatabaseClass.getMesseges();
	public MessageService(){
		messeges.put(1L, new Message(1, "You can use Messages to send texts, photos, videos, and audio messages ", 
				 "Tejas"));
		messeges.put(2L, new Message(2, "If you can't reply to a message from the Lock screen, go to Settings ", 
				 "Ted"));
		messeges.put(3L, new Message(3, "When you delete a message or conversation, you can't get it back. So make sure that you save important information from your messages.", 
				 "John"));
		messeges.put(4L, new Message(4, "If you want to keep your messages for a certain amount of time, go to Settings > Messages > Keep Messages. ", 
				 "Peter"));
	}
	public List<Message> getAllMesseges(){
		
		List<Message> list = new ArrayList<Message>(messeges.values());
		return list;
		
	}
	public Message getMessage(long id){
		return messeges.get(id);
	}
	public Message addMessage(Message m){
		m.setId(messeges.size()+1L);
		messeges.put(m.getId(), m);
		return m;
	}
	public Message removeMessage(long id){
		return messeges.remove(id);
	}
	
	public Message updateMessage(Message m){
		if(m.getId() <= 0){
			return null;
		}
		messeges.put(m.getId(),m );
		return m;
	}
}
