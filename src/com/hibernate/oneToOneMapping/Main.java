package com.hibernate.oneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStudent_name("kokpheng");

		StudentDetail studentDetail = new StudentDetail();
		studentDetail.setStudent_mobile_number("010839775");
		
		//this is an important step
		studentDetail.setStudent(student);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction(); // for insert update delete

		//please note I am not saving student object but still it will be save in database
		//that's the magic of one to one mapping
		session.save(studentDetail); 

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}
}
