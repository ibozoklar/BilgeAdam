package com.ihsan.icerikyonetimi.main;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Session;

import com.ihsan.icerikyonetimi.utility.HibernateUtils;

public class Main {

	private static EntityManager entityManager;
	private static CriteriaBuilder builder;

	public static void main(String[] args) {

		IMPL.IMPLData();

		entityManager = HibernateUtils.getSessionFactory().createEntityManager();
		builder = entityManager.getCriteriaBuilder();

		// makaleBosOlanlar();
		enCokIcerikUretenKullanici();

	}

	public static void makaleBosOlanlar() {

		String hql = "select s.id from Subjectdetail as s where s.article is null ";
		Session session = HibernateUtils.getSessionFactory().openSession();
		TypedQuery<Object[]> list = session.createQuery(hql, Object[].class);

		List<Object[]> list1 = session.createQuery(hql).getResultList();

		for (Object[] arr : list1) {
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void enCokIcerikUretenKullanici() {

		String hql = "select max(user_id), user_id from subjectdetail";
		Session session = HibernateUtils.getSessionFactory().openSession();
		TypedQuery<Object[]> list = session.createQuery(hql, Object[].class);

		List<Object[]> list1 = session.createQuery(hql).getResultList();

		for (Object[] arr : list1) {
			System.out.println(Arrays.toString(arr));
		}

	}

	public static void sorularGenellikleHangiDerstenSorulmus() {

		String hql = "select max(subjectdetail), subjectdetail from tbl_questions ";
		Session session = HibernateUtils.getSessionFactory().openSession();
		TypedQuery<Object[]> list = session.createQuery(hql, Object[].class);

		List<Object[]> list1 = session.createQuery(hql).getResultList();

		for (Object[] arr : list1) {
			System.out.println(Arrays.toString(arr));
		}

	}

}
