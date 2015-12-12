package n04.com.hibernate.manyToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		//Create studentAddress object
		N04_StudentAddress studentAddress=new N04_StudentAddress();
		studentAddress.setAddress_detail("Phnom Penh");
		
		
		//Create two student object and assign studentAddress for it
		N04_Student student1=new N04_Student();
		student1.setStudent_name("Kokpheng");
		student1.setStudentAddress(studentAddress);
	
		N04_Student student2=new N04_Student();
		student2.setStudent_name("Kokpheng2");
		student2.setStudentAddress(studentAddress);
		
		// Assign student to collection
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
