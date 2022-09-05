package com.ihsan.icerikyonetimi.service;

import com.ihsan.icerikyonetimi.entity.Admin;
import com.ihsan.icerikyonetimi.repository.AdminRepository;
import com.ihsan.icerikyonetimi.utility.MyFactoryRepository;
import com.ihsan.icerikyonetimi.utility.MyFactoryService;

public class AdminService extends MyFactoryService<MyFactoryRepository, Admin, Long> {

	public AdminService() {
		super(new AdminRepository());

	}
}