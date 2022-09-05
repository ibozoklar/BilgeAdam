package com.ihsan.icerikyonetimi.repository;

import com.ihsan.icerikyonetimi.entity.Admin;
import com.ihsan.icerikyonetimi.utility.MyFactoryRepository;

public class AdminRepository extends MyFactoryRepository<Admin, Long> {

	public AdminRepository() {
		super(new Admin());

	}

}
