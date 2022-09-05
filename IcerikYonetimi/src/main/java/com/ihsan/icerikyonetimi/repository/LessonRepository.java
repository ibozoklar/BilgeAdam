package com.ihsan.icerikyonetimi.repository;

import com.ihsan.icerikyonetimi.entity.Lesson;
import com.ihsan.icerikyonetimi.utility.MyFactoryRepository;

public class LessonRepository extends MyFactoryRepository<Lesson, Long> {

	public LessonRepository() {
		super(new Lesson());

	}

}
