package com.cleanarchitecture.external.database;

import java.util.HashMap;
import java.util.Map;

import com.cleanarchitecture.domain.User;

public class UserGateway {
	private Map<String, User> map;

	public UserGateway() {
		map = new HashMap<>();
		map.put("sriram@gmail.com", new User("sriram@gmail.com", "Sriram"));
		map.put("prabhu@gmail.com", new User("prabhu@gmail.com", "Prabhu"));
		map.put("suresh@gmail.com", new User("suresh@gmail.com", "Suresh"));
	}

	public User findByUserId(String userId) {
		return map.get(userId);
	}
}