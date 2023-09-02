package com.monst3r.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
	private  String usrId;
	private String name;
	private String email;
	
	
	public String getUsrId() {
		return usrId;
	}


	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(String usrId, String name, String email) {
		super();
		this.usrId = usrId;
		this.name = name;
		this.email = email;
	}


	@Override
	public String toString() {
		return "User [usrId=" + usrId + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
	
}
