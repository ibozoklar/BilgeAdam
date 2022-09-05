package com.ihsan.icerikyonetimi.repository;

import com.ihsan.icerikyonetimi.entity.Editor;
import com.ihsan.icerikyonetimi.utility.MyFactoryRepository;

public class EditorRepository extends MyFactoryRepository<Editor, Long> {

	public EditorRepository() {
		super(new Editor());

	}

}
