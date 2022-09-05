package com.ihsan.icerikyonetimi.repository;

import com.ihsan.icerikyonetimi.entity.SubjectDetail;
import com.ihsan.icerikyonetimi.utility.MyFactoryRepository;

public class SubjectDetailRepository extends MyFactoryRepository<SubjectDetail, Long> {

	public SubjectDetailRepository() {
		super(new SubjectDetail());

	}

}
