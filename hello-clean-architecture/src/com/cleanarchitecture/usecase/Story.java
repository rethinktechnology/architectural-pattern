package com.cleanarchitecture.usecase;

import com.cleanarchitecture.input.StoryRequest;

/**
 * In Uncle Bob's clean architectural pattern, Story represents an Use Case of
 * the business domain
 * 
 * @author srirammuthaiah
 *
 */
public interface Story {

	void execute(StoryRequest request);

}
