package com.api.messenger.service;

import java.util.ArrayList;
import java.util.List;

import com.api.messenger.model.Message;

public class MessageService {

	public List<Message> getAllMesseges(){
		Message m1 = new Message(1L, "You can use Messages to send texts, photos, videos, and audio messages ", 
				 "Tejas");
		Message m2 = new Message(1L, "If you can't reply to a message from the Lock screen, go to Settings ", 
				 "Ted");
		Message m3 = new Message(1L, "When you delete a message or conversation, you can't get it back. So make sure that you save important information from your messages.", 
				 "John");
		Message m4 = new Message(1L, "If you want to keep your messages for a certain amount of time, go to Settings > Messages > Keep Messages.  ", 
				 "Peter");
		List<Message> list = new ArrayList<Message>();
		list.add(m1);list.add(m2);list.add(m3);list.add(m4);
		return list;
		
	}
}
