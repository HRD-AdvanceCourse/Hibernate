package com.hibernate.manyToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		StudentAddress studentAddress=new StudentAddress();
		studentAddress.setAddress_detail("Phnom Penh");
		
		Student student1=new Student();
		student1.setStudent_name("Kokpheng");
		student1.setStudentAddress(studentAddress);
	
		Student student2=new Student();
		student2.setStudent_name("Kokpheng2");
		student2.setStudentAddress(studentAddress);
		
		(studentAddress.getStudent()).add(student1);
		(studentAddress.getStudent()).add(student2);
		
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(studentAddress);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	
	}

}
