package com.cleanarchitecture.usecase;

import com.cleanarchitecture.domain.User;
import com.cleanarchitecture.external.database.UserGateway;
import com.cleanarchitecture.input.GreetUserStoryRequest;
import com.cleanarchitecture.output.GreetUserStoryResponse;
import com.cleanarchitecture.view.GreetUserStoryPresenter;

public class GreetUser implements Story<GreetUserStoryRequest> {

	private UserGateway userGateway;
	private GreetUserStoryPresenter presenter;

	public GreetUser(UserGateway userGateway, GreetUserStoryPresenter presenter) {
		super();
		this.userGateway = userGateway;
		this.presenter = presenter;
	}

	@Override
	public void execute(GreetUserStoryRequest request) {
		User user = userGateway.findByUserId(request.userId);
		presenter.execute(new GreetUserStoryResponse(user.getFirstName()));
	}

}