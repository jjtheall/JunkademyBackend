package com.csc492;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserClassController {

	@Autowired
	private UserClassService userClassService;
	
	@GetMapping
	@RequestMapping(path="/user/get")
	@ResponseStatus(HttpStatus.OK)
	public UserClass fetchUserByName(String username) {
		return userClassService.fetchUserByName(username);
	}
	
	@GetMapping
	@RequestMapping(path="/user/getall")
	@ResponseStatus(HttpStatus.OK)
	public List<UserClass> fetchAllUsers() {
		return userClassService.fetchAllUsers();
	}
	
	@PostMapping
	@RequestMapping(path="/user/save")
	@ResponseStatus(HttpStatus.OK)
	public UserClass saveUser(@RequestBody UserClassDTO userClassDTO) {
		return userClassService.saveUser(userClassDTO);
	}
	
	
}
