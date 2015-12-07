package main.java;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Student_Info student = new Student_Info();
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		student.setName("Kokpheng");
		student.setDob(new Date());
		session.save(student);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
