package com.ihsan.icerikyonetimi.repository;

import com.ihsan.icerikyonetimi.entity.Answers;
import com.ihsan.icerikyonetimi.utility.MyFactoryRepository;

public class AnswersRepository extends MyFactoryRepository<Answers, Long> {

	public AnswersRepository() {
		super(new Answers());

	}

}
