package com.cleanarchitecture.usecase;

public interface Story<T> {
	void execute(T t);
}
