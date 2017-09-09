package com.cn.xtzn.pojo;

public class User {

	private Integer id;
	private String username;
	private String password;
	private Integer age;
	public User(Integer id, String username, String password, Integer age) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.age = age;
	}
	public User() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", user_name=" + username + ", password=" + password + ", age=" + age + "]";
	}
	
	
}
