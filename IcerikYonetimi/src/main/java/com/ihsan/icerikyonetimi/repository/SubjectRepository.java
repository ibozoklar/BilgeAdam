package com.ihsan.icerikyonetimi.repository;

import com.ihsan.icerikyonetimi.entity.Subject;
import com.ihsan.icerikyonetimi.utility.MyFactoryRepository;

public class SubjectRepository extends MyFactoryRepository<Subject, Long> {

	public SubjectRepository() {
		super(new Subject());

	}

}
