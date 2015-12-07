package com.hibernate.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setStudent_name("Kokpheng");

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction(); 

		session.save(student1);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}
