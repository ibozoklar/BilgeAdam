package com.ihsan.icerikyonetimi.repository;

import com.ihsan.icerikyonetimi.entity.Other;
import com.ihsan.icerikyonetimi.utility.MyFactoryRepository;

public class OtherRepository extends MyFactoryRepository<Other, Long> {

	public OtherRepository() {
		super(new Other());

	}

}
