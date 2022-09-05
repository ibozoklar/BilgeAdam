package com.ihsan.icerikyonetimi.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 50)
	private String name;

	@ManyToOne
	private Lesson lesson;

	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "subjectdetail", referencedColumnName = "subject")
	private SubjectDetail subjectdetail;

	@Temporal(TemporalType.DATE)
	private Date createdAt;

	@Temporal(TemporalType.DATE)
	private Date updatedAt;

	@Column(name = "enebaled", nullable = false)
	private boolean enebaled;

	public Subject(String name, Lesson lesson, boolean enabled) {
		super();
		this.name = name;
		this.lesson = lesson;
		this.subjectdetail = subjectdetail;
		this.enebaled = enabled;
	}

	public Subject() {
		// TODO Auto-generated constructor stub
	}

}
