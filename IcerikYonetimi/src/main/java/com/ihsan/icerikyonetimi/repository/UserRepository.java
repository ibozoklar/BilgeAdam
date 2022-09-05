package com.ihsan.icerikyonetimi.repository;

import com.ihsan.icerikyonetimi.entity.User;
import com.ihsan.icerikyonetimi.utility.MyFactoryRepository;

public class UserRepository extends MyFactoryRepository<User, Long> {

	public UserRepository() {
		super(new User());

	}

}
