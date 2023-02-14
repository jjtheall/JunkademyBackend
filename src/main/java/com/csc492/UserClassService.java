package com.csc492;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserClassService {
	
	@Autowired
	private UserClassRepo userClassRepo;
	
	public UserClass fetchUserByName(String username) {
		return userClassRepo.fetchUserByName(username);
	}
	
	public UserClass saveUser(UserClassDTO userClassDTO) {
		UserClass user = new UserClass();
		user.setUser_Id(userClassDTO.getUser_id());
		user.setUserName(userClassDTO.getUsername());
		user.setPassword(userClassDTO.getPassword());
		
		return userClassRepo.save(user);
	}

}