package com.csc492;

public class UserClassDTO {
	private int user_id;
	private String username;
	private String password;
	
	public UserClassDTO() {
		super();
	}
	
	public UserClassDTO(int user_id, String username, String password) {
		this.user_id = user_id;
		this.username = username;
		this.password = password;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
