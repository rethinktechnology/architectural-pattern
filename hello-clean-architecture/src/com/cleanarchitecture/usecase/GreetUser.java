package com.cleanarchitecture.usecase;

import com.cleanarchitecture.domain.User;
import com.cleanarchitecture.external.database.UserGateway;
import com.cleanarchitecture.input.GreetUserStoryRequest;
import com.cleanarchitecture.input.StoryRequest;
import com.cleanarchitecture.output.GreetUserStoryResponse;
import com.cleanarchitecture.view.GreetUserStoryPresenter;

public class GreetUser implements Story {
	private final UserGateway userGateway;
	private final GreetUserStoryPresenter presenter;

	public GreetUser(UserGateway userGateway, GreetUserStoryPresenter presenter) {
		this.userGateway = userGateway;
		this.presenter = presenter;
	}
	
	@Override
	public void execute(StoryRequest request) {
		GreetUserStoryRequest greetRequest = (GreetUserStoryRequest) request;
		User user = userGateway.findByUserId(greetRequest.userId);
		presenter.execute(new GreetUserStoryResponse(user.getFirstName()));
	}
}
