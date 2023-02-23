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
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpHeaders;



@RestController
public class UserClassController {

	@Autowired
	private UserClassService userClassService;
	private UserClass user;
	
	@GetMapping
	@RequestMapping(path="/user/login")
	@ResponseStatus(HttpStatus.OK)
	public boolean loginUser(@RequestBody UserLoginDTO userLoginDTO) {
		return userClassService.loginUser(userLoginDTO);
	}
	
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
	public UserClass saveUser(@RequestBody UserLoginDTO userLoginDTO) {
		return userClassService.saveUser(userLoginDTO);
	}

	@RequestMapping("/login")
	public ResponseEntity<String> login(@RequestBody UserClass user) {
		boolean authenticated = authenticateUser(user.getUserName(), user.getPassword());

		//Here we need to import a class that connects to the database
		//Then we can write a query that checks the credentials in the database against whatever the user inputs for 
		//credentials

		if(authenticated) {
			//Generate token for user
			String token = generateToken(user.getUserName());

			//Return the token
			HttpHeaders headers = new HttpHeaders();
			headers.add("Authorization", "Bearer " + token);
			return ResponseEntity.ok().headers(headers).build();
		}
		else {
			//Return Unauthorized status
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
	}

	private boolean authenticateUser(String username, String password) {
		// Check if username and password is valid

		return true; // or false...
	}

	private String generateToken(String username) {
		//generate JWT token

		return "token";
	}

	}
	
	

