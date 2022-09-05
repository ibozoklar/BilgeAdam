package com.ihsan.icerikyonetimi.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity

public class Editor extends User {

	@OneToMany(mappedBy = "editor", cascade = CascadeType.ALL)
	private List<Answers> answers = new ArrayList<>();

	public Editor(String name, String surname) {
		super(name, surname);
		setRole(Role.EDITOR);
	}

	public Editor() {
		super();
		setRole(Role.EDITOR);
	}

	public List<Answers> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}

}
