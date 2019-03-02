package com.cleanarchitecture.view;

import com.cleanarchitecture.output.StoryResponse;

public interface StoryPresenter<T extends StoryResponse> {
	void execute(T t);
}
