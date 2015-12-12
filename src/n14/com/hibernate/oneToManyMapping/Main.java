package n14.com.hibernate.oneToManyMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration ().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		N14_College college=new N14_College();
		college.setCollegeName("NU");
		
		N14_Student student = new N14_Student();
		student.setStudentName("Kokpheng");
		

		N14_Student student2 = new N14_Student();
		student2.setStudentName("Lundy");
		
		student.setCollege(college);
		student2.setCollege(college);
		
		session.save(college);
		session.save(student);
		session.save(student2);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
