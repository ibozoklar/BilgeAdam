package com.ihsan.icerikyonetimi.repository;

import com.ihsan.icerikyonetimi.entity.Questions;
import com.ihsan.icerikyonetimi.utility.MyFactoryRepository;

public class QuestionsRepository extends MyFactoryRepository<Questions, Long> {

	public QuestionsRepository() {
		super(new Questions());

	}

}
