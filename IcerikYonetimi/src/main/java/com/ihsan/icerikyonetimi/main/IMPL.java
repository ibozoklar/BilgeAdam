package com.ihsan.icerikyonetimi.main;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ihsan.icerikyonetimi.entity.Answers;
import com.ihsan.icerikyonetimi.entity.Editor;
import com.ihsan.icerikyonetimi.entity.Lesson;
import com.ihsan.icerikyonetimi.entity.Other;
import com.ihsan.icerikyonetimi.entity.Questions;
import com.ihsan.icerikyonetimi.entity.Subject;
import com.ihsan.icerikyonetimi.entity.SubjectDetail;
import com.ihsan.icerikyonetimi.utility.HibernateUtils;

public class IMPL {

	private static Session ss;
	private static Transaction tt;
	private static EntityManager entityManager;
	private static CriteriaBuilder builder;

	public static void IMPLData() {

		ss = HibernateUtils.getSessionFactory().openSession();
		tt = ss.beginTransaction();

		Calendar calendar = Calendar.getInstance();

		// OTHER
		Other otherUser1 = new Other("Elon", "Musk");
		ss.save(otherUser1);

		Other otherUser2 = new Other("Jeff", "Bezos");
		ss.save(otherUser2);

		Other otherUser3 = new Other("Michael", "Jordan");
		ss.save(otherUser3);

		// EDITOR
		Editor editor1 = new Editor("Ihsan Can", "Bozoklar");
		ss.save(editor1);

		Editor editor2 = new Editor("LeBron", "James");
		ss.save(editor2);

		Editor editor3 = new Editor("Kobe", "Bryant");
		ss.save(editor3);

		Editor editor4 = new Editor("Tony", "Parker");
		ss.save(editor4);

		// LESSON
		Lesson lesson1 = new Lesson("Java", "Introduction to programming", true);
		ss.save(lesson1);

		Lesson lesson2 = new Lesson("Basketball", "How to shoot", true);
		ss.save(lesson2);

		// SUBJECT
		Subject subject1 = new Subject("String methods", lesson1, true);
		ss.save(subject1);

		Subject subject2 = new Subject("Arrays", lesson1, true);
		ss.save(subject2);

		Subject subject3 = new Subject("How to shoot", lesson2, true);
		ss.save(subject3);

		// SubjectDetail
		SubjectDetail subjectDetail1 = new SubjectDetail(subject1, "String Methods", "Description about strings...",
				"Article about strings....", true, editor1);
		ss.save(subjectDetail1);

		SubjectDetail subjectDetail2 = new SubjectDetail(subject2, "Array subject", "description about arrays",
				"Article about arrays....", true, editor1);
		ss.save(subjectDetail2);

		SubjectDetail subjectDetail3 = new SubjectDetail(subject3, "Shooting subject", "description about shooting",
				"Article about arrays....", true, editor1);
		ss.save(subjectDetail3);

		// QUESTIONS
		calendar.set(2022, Calendar.JUNE, 15);
		Date date1 = calendar.getTime();
		Questions question1 = new Questions(subjectDetail1, otherUser1, "How can I change a character in a string?",
				date1, true);
		ss.save(question1);

		Questions question2 = new Questions(subjectDetail2, otherUser2, "How can I get the first item in an array?",
				date1, true);
		ss.save(question2);

		Questions question3 = new Questions(subjectDetail3, otherUser3, "How can I shoot from the 3pt line?", date1,
				true);
		ss.save(question3);

		// Answers
		calendar.set(2022, Calendar.JUNE, 16);
		Date date2 = calendar.getTime();
		Answers answers1 = new Answers(question1, editor1, "answer for string question", date2, true);
		ss.save(answers1);

		calendar.set(2022, Calendar.JUNE, 17);
		Date date3 = calendar.getTime();
		Answers answers2 = new Answers(question2, editor1, "answer for array question", date3, true);
		ss.save(answers2);

		Answers answers3 = new Answers(question3, editor1, "answer for basketball question", date3, true);
		ss.save(answers3);

		calendar.set(2022, Calendar.JUNE, 18);
		Date date4 = calendar.getTime();
		Answers answers4 = new Answers(question1, editor2, "answer for basketball question", date4, true);
		ss.save(answers4);

		calendar.set(2022, Calendar.JUNE, 19);
		Date date5 = calendar.getTime();
		Answers answers5 = new Answers(question1, editor2, "answer for basketball question", date5, true);
		ss.save(answers5);

		tt.commit();
		ss.close();
	}

}
