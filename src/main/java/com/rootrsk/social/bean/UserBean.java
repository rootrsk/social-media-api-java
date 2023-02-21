package com.rootrsk.social.bean;

import org.springframework.stereotype.Component;

@Component
public class UserBean {
	private int id;
	private String fullname;
	private String username;
	private String email;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserBean(int id, String fullname, String username, String email, String password) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.username = username;
		this.email = email;
		this.password = password;
	}
	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UseBean [id=" + id + ", fullname=" + fullname + ", username=" + username + ", email=" + email
				+ ", password=" + password + "]";
	}
	
	
}
