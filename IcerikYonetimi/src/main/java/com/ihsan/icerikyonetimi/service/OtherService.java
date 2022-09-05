package com.ihsan.icerikyonetimi.service;

import com.ihsan.icerikyonetimi.entity.Other;
import com.ihsan.icerikyonetimi.repository.OtherRepository;
import com.ihsan.icerikyonetimi.utility.MyFactoryRepository;
import com.ihsan.icerikyonetimi.utility.MyFactoryService;

public class OtherService extends MyFactoryService<MyFactoryRepository, Other, Long> {

	public OtherService() {
		super(new OtherRepository());

	}
}