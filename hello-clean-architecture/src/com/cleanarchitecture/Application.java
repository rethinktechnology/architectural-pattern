package com.cleanarchitecture;

import com.cleanarchitecture.external.database.UserGateway;
import com.cleanarchitecture.input.GreetUserStoryRequest;
import com.cleanarchitecture.input.StoryRequest;
import com.cleanarchitecture.usecase.GreetUser;
import com.cleanarchitecture.view.GreetUserStoryPresenter;

public class Application {

	public static void main(String[] args) {
		GreetUser greetUser = new GreetUser(new UserGateway(), new GreetUserStoryPresenter());
		StoryRequest request = new GreetUserStoryRequest("sriram@gmail.com");
		greetUser.execute(request);
	}

}
