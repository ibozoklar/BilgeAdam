package com.ihsan.icerikyonetimi.service;

import com.ihsan.icerikyonetimi.entity.Answers;
import com.ihsan.icerikyonetimi.repository.AnswersRepository;
import com.ihsan.icerikyonetimi.utility.MyFactoryRepository;
import com.ihsan.icerikyonetimi.utility.MyFactoryService;

public class AnswersService extends MyFactoryService<MyFactoryRepository, Answers, Long> {

	public AnswersService() {
		super(new AnswersRepository());

	}
}