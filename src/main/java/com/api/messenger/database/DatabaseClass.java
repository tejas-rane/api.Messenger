package com.api.messenger.database;

import java.util.HashMap;
import java.util.Map;

import com.api.messenger.model.Message;
import com.api.messenger.model.Profile;

public class DatabaseClass {
	private static Map<Long, Message> messeges = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();
	public static Map<Long, Message> getMesseges(){
		return messeges;
	}
	public static Map<String, Profile> getProfiles(){
		return profiles;
	}
}
