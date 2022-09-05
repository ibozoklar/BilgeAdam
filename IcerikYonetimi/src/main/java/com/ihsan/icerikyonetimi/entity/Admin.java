package com.ihsan.icerikyonetimi.entity;

import javax.persistence.Entity;

@Entity

public class Admin extends User {

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
		setRole(Role.ADMIN);
	}

	public Admin(String name, String surname) {
		super(name, surname);
		// TODO Auto-generated constructor stub
		setRole(Role.ADMIN);
	}

}
