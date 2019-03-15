package com.spring.messenger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.spring.messenger.model.Profile;


public class ProfileService {

	
	/*public ProfileService() {
		Profile profile = new Profile(1L, "Navya", "Surendran", "navya");		
		profileDatabase.put(profile.getProfileName(), profile);
	}
	
	public Profile addProfile(Profile profile) {
		profile.setId((long) (profileDatabase.size() +1));
		profileDatabase.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public List<Profile> getProfiles(){
		return new ArrayList<Profile> (profileDatabase.values());
	}
	
	public Profile getProfile(String profileName) {
		if(profileName.isEmpty()) {
			return null;
		}
		return profileDatabase.get(profileName);
	}
	
	public Profile updateProfile(Profile profile) {
		if(profile.getProfileName().isEmpty()) {
			return null;
		}
		profileDatabase.replace(profile.getProfileName(), profile);
		return profile;
	}
	
	public void removeProfile(String profileName) {
		profileDatabase.remove(profileName);
	}*/
	
}
