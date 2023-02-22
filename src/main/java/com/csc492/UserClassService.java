package com.csc492;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserClassService {
	
	@Autowired
	private UserClassRepo userClassRepo;
	
	public boolean loginUser(UserLoginDTO userLoginDTO) {
		String username = userClassRepo.loginUser(userLoginDTO.getUsername(), userLoginDTO.getPassword());
		return username != null;
	}
	
	public UserClass fetchUserByName(String username) {
		return userClassRepo.fetchUserByName(username);
	}
	
	public List<UserClass> fetchAllUsers() {
		return (List<UserClass>)userClassRepo.findAll();
	}
	
	public UserClass saveUser(UserLoginDTO userLoginDTO) {
		UserClass user = new UserClass();
		user.setUserName(userLoginDTO.getUsername());
		user.setPassword(userLoginDTO.getPassword());
		
		String existingUsername = userClassRepo.loginUser(userLoginDTO.getUsername(),userLoginDTO.getPassword());
		if(existingUsername == null) {
			return userClassRepo.save(user);
		}
		else {
			return null;
		}
	}

}
