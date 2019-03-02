package com.cleanarchitecture.view;

import java.util.Collections;
import java.util.Map;

import com.cleanarchitecture.output.GreetUserStoryResponse;

public class GreetUserStoryPresenter implements StoryPresenter<GreetUserStoryResponse> {

	@Override
	public void execute(GreetUserStoryResponse response) {
		Map<String, Object> viewModel = Collections.singletonMap("firstName", response.firstName);
		
		System.out.printf("Hello, %s%n", viewModel.get("firstName"));
	}

}
