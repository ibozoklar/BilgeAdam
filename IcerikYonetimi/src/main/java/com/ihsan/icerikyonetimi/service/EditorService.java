package com.ihsan.icerikyonetimi.service;

import com.ihsan.icerikyonetimi.entity.Editor;
import com.ihsan.icerikyonetimi.repository.EditorRepository;
import com.ihsan.icerikyonetimi.utility.MyFactoryRepository;
import com.ihsan.icerikyonetimi.utility.MyFactoryService;

public class EditorService extends MyFactoryService<MyFactoryRepository, Editor, Long> {

	public EditorService() {
		super(new EditorRepository());

	}
}