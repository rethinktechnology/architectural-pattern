package com.cleanarchitecture.domain;

public class User {

	private String firstName;
	private String userId;

	public User(String userId, String firstName) {
		this.userId = userId;
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
