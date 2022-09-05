package com.ihsan.icerikyonetimi.service;

import com.ihsan.icerikyonetimi.entity.User;
import com.ihsan.icerikyonetimi.repository.UserRepository;
import com.ihsan.icerikyonetimi.utility.MyFactoryRepository;
import com.ihsan.icerikyonetimi.utility.MyFactoryService;

public class UserService extends MyFactoryService<MyFactoryRepository, User, Long> {

	public UserService() {
		super(new UserRepository());

	}
}