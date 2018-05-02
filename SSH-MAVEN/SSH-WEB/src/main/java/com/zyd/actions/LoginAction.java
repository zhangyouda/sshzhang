package com.zyd.actions;

public class LoginAction {

	private String userName;
	private int age;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String execute(){
		System.out.println("userName=" + userName);
		System.out.println("age=" + age);
		return "success";
	}

}
