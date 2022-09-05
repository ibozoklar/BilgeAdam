package com.ihsan.icerikyonetimi.service;

import com.ihsan.icerikyonetimi.entity.Lesson;
import com.ihsan.icerikyonetimi.repository.LessonRepository;
import com.ihsan.icerikyonetimi.utility.MyFactoryRepository;
import com.ihsan.icerikyonetimi.utility.MyFactoryService;

public class LessonService extends MyFactoryService<MyFactoryRepository, Lesson, Long> {

	public LessonService() {
		super(new LessonRepository());

	}
}