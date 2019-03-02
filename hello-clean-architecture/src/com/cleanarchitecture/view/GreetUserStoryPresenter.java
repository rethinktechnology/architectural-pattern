package com.cleanarchitecture.view;

import java.util.Collections;
import java.util.Map;

import com.cleanarchitecture.output.GreetUserStoryResponse;
import com.cleanarchitecture.output.StoryResponse;

public class GreetUserStoryPresenter implements StoryPresenter {

	@Override
	public void execute(StoryResponse response) {
		GreetUserStoryResponse greetResponse = (GreetUserStoryResponse) response;
		Map<String, Object> viewModel = Collections.singletonMap("firstName", greetResponse.firstName);
		System.out.printf("Hello, %s%n", viewModel.get("firstName"));
	}
}
