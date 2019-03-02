package com.cleanarchitecture.output;

public class GreetUserStoryResponse implements StoryResponse {
	public final String firstName;

	public GreetUserStoryResponse(String firstName) {
		super();
		this.firstName = firstName;
	}

}
