package com.ihsan.icerikyonetimi.service;

import com.ihsan.icerikyonetimi.entity.Subject;
import com.ihsan.icerikyonetimi.repository.SubjectRepository;
import com.ihsan.icerikyonetimi.utility.MyFactoryRepository;
import com.ihsan.icerikyonetimi.utility.MyFactoryService;

public class SubjectService extends MyFactoryService<MyFactoryRepository, Subject, Long> {

	public SubjectService() {
		super(new SubjectRepository());

	}
}