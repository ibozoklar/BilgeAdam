package com.ihsan.icerikyonetimi.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class Questions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(optional = false, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "question_subjectdetail", referencedColumnName = "id")
	private SubjectDetail subjectDetail;

	@OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
	private List<Answers> answers = new ArrayList<>();

	@ManyToOne
	private Other otheruser;

	@Column(length = 50)
	private String title;

	@Column(length = 1000)
	private String question;

	@Temporal(TemporalType.DATE)
	private Date createdAt;

	@Temporal(TemporalType.DATE)
	private Date updatedAt;

	@Column(name = "enebaled", nullable = false)
	private boolean enebaled;

	public Questions(SubjectDetail subjectDetail, Other otheruser, String question, Date createdAt, boolean enebaled) {
		super();
		this.subjectDetail = subjectDetail;
		this.otheruser = otheruser;
		this.question = question;
		this.createdAt = createdAt;
		this.enebaled = enebaled;
	}

	public Questions() {
		// TODO Auto-generated constructor stub
	}

}
