package com.ihsan.icerikyonetimi.service;

import com.ihsan.icerikyonetimi.entity.Questions;
import com.ihsan.icerikyonetimi.repository.QuestionsRepository;
import com.ihsan.icerikyonetimi.utility.MyFactoryRepository;
import com.ihsan.icerikyonetimi.utility.MyFactoryService;

public class QuestionsService extends MyFactoryService<MyFactoryRepository, Questions, Long> {

	public QuestionsService() {
		super(new QuestionsRepository());

	}
}