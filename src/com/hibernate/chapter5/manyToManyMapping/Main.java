package com.hibernate.chapter5.manyToManyMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Chpt5Delegate delegate1 = new Chpt5Delegate();
		delegate1.setDelegateName("Alex Rod");
		Chpt5Delegate delegate2 = new Chpt5Delegate();
		delegate2.setDelegateName("Linda Berry");
		Chpt5Delegate delegate3 = new Chpt5Delegate();
		delegate3.setDelegateName("Jonh Deo");
		Chpt5Delegate delegate4 = new Chpt5Delegate();
		delegate4.setDelegateName("James Dean");

		Chpt5Event Java101 = new Chpt5Event();
		Java101.setEventName("Java - 101");
		Chpt5Event cplus101 = new Chpt5Event();
		cplus101.setEventName("C++ - 101");
		Chpt5Event math101 = new Chpt5Event();
		math101.setEventName("Math - 101");
		
		Java101.getDelegates().add(delegate1);
		Java101.getDelegates().add(delegate2);
		Java101.getDelegates().add(delegate3);
		cplus101.getDelegates().add(delegate2);
		cplus101.getDelegates().add(delegate3);
		math101.getDelegates().add(delegate4);
		
		
		session.save(delegate1);
		session.save(delegate2);
		session.save(delegate3);
		session.save(delegate4);
		session.save(Java101);
		session.save(cplus101);
		session.save(math101);
		
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
