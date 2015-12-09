package com.hibernate.chapter5.oneToManyMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration ().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		CollegeChpt5 college=new CollegeChpt5();
		college.setCollegeName("NU");
		
		StudentChpt5 student = new StudentChpt5();
		student.setStudentName("Kokpheng");
		

		StudentChpt5 student2 = new StudentChpt5();
		student2.setStudentName("Lundy");
		
		student.setCollege(college);
		student2.setCollege(college);
		
		session.save(college);
		session.save(student);
		session.save(student2);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
