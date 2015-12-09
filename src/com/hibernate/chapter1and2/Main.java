package com.hibernate.chapter1and2;

import java.sql.Date;
import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		Employee emp = new Employee();
	
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
	
		emp.setEmpId(100);
		emp.setEmpName("Kokpheng");
		emp.setEmpEmailAddress("Yinkokpheng@yahoo.com");
		emp.setEmpPassword("my password");
		emp.setPermanent(true);
		emp.setEmpJoinDate(new GregorianCalendar(2015,05,26));
		emp.setEmpLoginTime(Date.valueOf("2015-05-26"));
		
		session.save(emp);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
