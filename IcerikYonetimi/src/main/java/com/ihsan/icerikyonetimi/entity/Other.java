package com.ihsan.icerikyonetimi.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity

public class Other extends User {

	@OneToMany(mappedBy = "other", cascade = CascadeType.ALL)
	private List<Questions> questions;

	public Other() {
		super();
		setRole(Role.OTHER);
	}

	public Other(String name, String surname) {
		super(name, surname);
		setRole(Role.OTHER);
	}

	public List<Questions> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Questions> questions) {
		this.questions = questions;
	}

}
