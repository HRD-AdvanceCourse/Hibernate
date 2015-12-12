package n01.main.java;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		N01_StudentInfoDemo student = new N01_StudentInfoDemo();
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		student.setName("Kokpheng");
		student.setDob(new Date());
		
		student.setName("Kokpheng modified before save function");
		
		session.save(student);
		
		student.setName("Kokpheng modified after save function");
		
		session.getTransaction().commit();
		
		/* -Object create with new keyword and above save() it has a Transient state
		   -Object change after save() it lives in Persistent state till the close session
			
		The good thing above persistent state is once an object enter Persistent state
		after that if u make any more modification to that object then hibernate would make sure
		it would fire an update query to think that modification with the database record */
		
		//Hibernate: insert into STUDENT_INFORMATION (dob, FULL_NAME) values (?, ?)
		//Hibernate: update STUDENT_INFORMATION set dob=?, FULL_NAME=? where rollNo=?
		session.close();
		
		
		
		student.setName("Kokpheng modified post session.close function detached state");
		//Object after close() it become Detached States. and hibernate will not think that 
		//modification it is an existing record in the database

		//to convert object from detached state to persistent state
		//hibernate say just open a new session and patse the detached object
		//to the update function of that new session
		
		Session session2 = sessionFactory.openSession();
		session2.beginTransaction();
		
		session2.update(student);
		
		session2.getTransaction().commit();
		session2.close();
		
		sessionFactory.close();
		//this close function must be put at the end, everything will end after close like connection, object
	}

}
