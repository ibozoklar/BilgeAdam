package com.ihsan.icerikyonetimi.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ihsan.icerikyonetimi.entity.Admin;
import com.ihsan.icerikyonetimi.entity.Answers;
import com.ihsan.icerikyonetimi.entity.Editor;
import com.ihsan.icerikyonetimi.entity.Lesson;
import com.ihsan.icerikyonetimi.entity.Other;
import com.ihsan.icerikyonetimi.entity.Questions;
import com.ihsan.icerikyonetimi.entity.Role;
import com.ihsan.icerikyonetimi.entity.Subject;
import com.ihsan.icerikyonetimi.entity.SubjectDetail;
import com.ihsan.icerikyonetimi.entity.User;

public class HibernateUtils {

	// hibernate ile baglanti kuracak

	private static final SessionFactory SESSION_FACTORY = sessionFactoryHibernate();

	private static SessionFactory sessionFactoryHibernate() {
		try {
			Configuration configuration = new Configuration();

			// Entity classlarimizi buraya ekliyoruz
			configuration.addAnnotatedClass(Admin.class);
			configuration.addAnnotatedClass(Answers.class);
			configuration.addAnnotatedClass(Editor.class);
			configuration.addAnnotatedClass(Lesson.class);
			configuration.addAnnotatedClass(Other.class);
			configuration.addAnnotatedClass(Questions.class);
			configuration.addAnnotatedClass(Role.class);
			configuration.addAnnotatedClass(Subject.class);
			configuration.addAnnotatedClass(SubjectDetail.class);
			configuration.addAnnotatedClass(User.class);

			SessionFactory factory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();

			return factory;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}

}
