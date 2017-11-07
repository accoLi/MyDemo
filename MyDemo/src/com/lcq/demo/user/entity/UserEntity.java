package com.lcq.demo.user.entity;

import java.io.Serializable;

public class UserEntity implements Serializable{
	private static final long serialVersionUID = 6122394232484053302L;
	private String userId;
	private String userName;
	private String password;
	private String state;
	private String role;
	private String sex;
	private String email;
	private String phone;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String toString(){
		return "user[userId:"+userId+",userName:"+userName+",password:"+password+",state:"+state+",role:"+role+",sex:"+sex+",email"+",phone"+phone+"]";
	}
  
}
