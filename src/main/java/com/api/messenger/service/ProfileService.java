package com.api.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.api.messenger.database.DatabaseClass;
import com.api.messenger.model.Profile;

public class ProfileService {

	private static Map<String, Profile> profiles = DatabaseClass.getProfiles();

	public ProfileService(){
		profiles.put("Tejas", new Profile(1L, "Tejas","Tejas","Rane"));
		profiles.put("John", new Profile(2L, "John","John","K"));
	}
	
	public List<Profile> getAllProfiles() {
		List<Profile> list = new ArrayList<Profile>(profiles.values());
		return list;
	}
	public Profile getProfile(String name){
		return profiles.get(name);
	}
	public Profile addProfile(Profile p){
		p.setId(profiles.size()+1);
		profiles.put(p.getProfileName(), p);
		return p;
	}
	public Profile updateProfile(Profile p){
		if(p.getProfileName().isEmpty()){
			return null;
		}
		profiles.put(p.getProfileName(),p );
		return p;
	}
	public Profile removeProfile(String name){
		return profiles.remove(name);
	}
	
}
