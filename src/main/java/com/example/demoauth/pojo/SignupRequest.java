package com.example.demoauth.pojo;

import lombok.Data;

import java.util.Set;
@Data
public class SignupRequest {
	
	private String username;
	private String group;
	private Set<String> roles;
	private String password;

}
