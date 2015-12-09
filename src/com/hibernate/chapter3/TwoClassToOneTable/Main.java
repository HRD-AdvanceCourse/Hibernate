package com.hibernate.chapter3.TwoClassToOneTable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
	public static void main(String[] args) {
		SchoolDetailChpt3 schoolDetail = new SchoolDetailChpt3();
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		schoolDetail.setPublicSchool(false);
		schoolDetail.setSchoolAddress("101");
		schoolDetail.setStudentCount(300);
		
		SchoolChpt3 school = new SchoolChpt3();
		school.setSchoolName("my school");
		school.setSchoolDetail(schoolDetail);
		
		session.save(school);
		session.getTransaction().commit();
		
		session.close();
		sessionFactory.close();
	}
}

