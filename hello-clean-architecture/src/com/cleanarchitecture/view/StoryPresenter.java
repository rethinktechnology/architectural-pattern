package com.cleanarchitecture.view;

import com.cleanarchitecture.output.StoryResponse;

/**
 * StoryPresenter (View) helps in rendering StoryResponse (Output) of Story (Use
 * Case)
 * 
 * @author srirammuthaiah
 *
 */
public interface StoryPresenter {

	void execute(StoryResponse response);

}
