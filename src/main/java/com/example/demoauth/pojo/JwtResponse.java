package com.example.demoauth.pojo;

import lombok.Data;

import java.util.List;
@Data
public class JwtResponse {
	private String token;
	private String type = "Bearer";
	private Long id;
	private String username;
	private String groups;
	private List<String> roles;
	
	public JwtResponse(String token, Long id, String username, String groups, List<String> roles) {
		this.token = token;
		this.id = id;
		this.username = username;
		this.groups = groups;
		this.roles = roles;
	}

}
