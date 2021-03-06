package com.barryku.gae.service;

import com.barryku.gae.dao.UserDao;

public class GreetingService {
	private UserDao dao;
	
	public String getGreet() {
		dao = dao == null ? new UserDao() : dao;
		return "Hello " + dao.getUser();
	}
	
	public String getGreetForUser(int i) {
		return "Hello " + dao.getUser(i);
	}
	
	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	
}
