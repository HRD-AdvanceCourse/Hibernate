package com.hibernate.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStudent_name("Kokpheng");

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		// Save function is used for insert student object to student table
		session.save(student);

		// --------------------------
		// Update function: using get() is retrieve the record from the student
		// table (it use select statment)
		// - Default arg is the name of the class which map to student table
		// - second is primary key for identify the record
		student = (Student) session.get(Student.class, 1);

		student.setStudent_name("New name");// change value

		session.update(student); // past object to update function

		// --------------------------
		// Delete function: using get() is retrieve the record from the student
		// table (it use select statment)
		// - Default arg is the name of the class which map to student table
		// - second is primary key for identify the record
		student = (Student) session.get(Student.class, 1);

		session.delete(student); // past object to delete function

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}
