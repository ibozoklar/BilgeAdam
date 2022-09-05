package com.ihsan.icerikyonetimi.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class Answers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@ManyToOne(cascade = CascadeType.ALL)
	private Questions question;

	@ManyToOne(cascade = CascadeType.ALL)
	private Editor editor;

	@Column
	private String answers;

	@Temporal(TemporalType.DATE)
	private Date createdAt;

	@Temporal(TemporalType.DATE)
	private Date updatedAt;

	@Column(name = "enebaled", nullable = false)
	private boolean enebaled;

	public Answers(Questions question, Editor editor, String answers, Date createdAt, boolean enebaled) {
		super();
		this.question = question;
		this.editor = editor;
		this.answers = answers;
		this.createdAt = createdAt;
		this.enebaled = enebaled;
	}

	public Answers() {
		// TODO Auto-generated constructor stub
	}

}
