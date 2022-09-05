package com.ihsan.icerikyonetimi.service;

import com.ihsan.icerikyonetimi.entity.SubjectDetail;
import com.ihsan.icerikyonetimi.repository.SubjectDetailRepository;
import com.ihsan.icerikyonetimi.utility.MyFactoryRepository;
import com.ihsan.icerikyonetimi.utility.MyFactoryService;

public class SubjectDetailService extends MyFactoryService<MyFactoryRepository, SubjectDetail, Long> {

	public SubjectDetailService() {
		super(new SubjectDetailRepository());

	}
}