package com.ihsan.icerikyonetimi.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class SubjectDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "subject_id", referencedColumnName = "id")
	private Subject subject;

	@OneToOne(cascade = CascadeType.ALL)
	private User user;

	@Column(length = 50)
	private String title;

	@Column(length = 2000)
	private String description;

	@Column(length = 5000)
	private String article;

	@Temporal(TemporalType.DATE)
	private Date createdAt;

	@Temporal(TemporalType.DATE)
	private Date updatedAt;

	@Column(name = "enebaled", nullable = false)
	private boolean enebaled;

	public SubjectDetail(Subject subject, String title, String description, String article, boolean enebaled,
			User user) {
		super();
		this.subject = subject;
		this.title = title;
		this.description = description;
		this.article = article;
		this.enebaled = enebaled;
		this.user = user;
	}

//	public List<User> getUsers() {
//		return users;
//	}
//
//	public void setUsers(List<User> users) {
//		this.users = users;
//	}

	public SubjectDetail() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean isEnebaled() {
		return enebaled;
	}

	public void setEnebaled(boolean enebaled) {
		this.enebaled = enebaled;
	}

	@Override
	public String toString() {
		return "SubjectDetail [id=" + id + ", subject=" + subject + ", title=" + title + ", description=" + description
				+ ", article=" + article + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", enebaled="
				+ enebaled + "]";
	}

}
