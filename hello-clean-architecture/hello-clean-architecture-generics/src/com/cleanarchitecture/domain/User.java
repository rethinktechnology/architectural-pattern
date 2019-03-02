package com.cleanarchitecture.domain;

public class User {

	private String userId;
	private String firstName;

	public User(String userId, String firstName) {
		super();
		this.userId = userId;
		this.firstName = firstName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
