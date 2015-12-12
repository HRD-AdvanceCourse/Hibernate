package n03.com.hibernate.oneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	// Step 3
	public static void main(String[] args) {
		N03_Student student = new N03_Student();
		student.setStudent_name("kokpheng");

		N03_StudentDetail studentDetail = new N03_StudentDetail();
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
