package com.cleanarchitecture.input;

public class GreetUserStoryRequest implements StoryRequest {

	public final String userId;

	public GreetUserStoryRequest(String userId) {
		super();
		this.userId = userId;
	}

}
