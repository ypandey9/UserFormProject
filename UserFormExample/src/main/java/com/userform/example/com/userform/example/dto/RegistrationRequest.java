package com.userform.example.com.userform.example.dto;
public class RegistrationRequest {

    private String username;
    private String password;
    
    // Getters and setters
    
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
	
	  // Constructors
	public RegistrationRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public RegistrationRequest() {}

  
}