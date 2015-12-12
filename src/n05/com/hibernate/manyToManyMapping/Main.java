package n05.com.hibernate.manyToManyMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		N05_StudentCertification studentCertification1 = new N05_StudentCertification();
		studentCertification1.setCertification_name("Java Certification");

		N05_StudentCertification studentCertification2 = new N05_StudentCertification();
		studentCertification2.setCertification_name("Oracle DB Certification");

		N05_Student student1 = new N05_Student();
		student1.setStudent_name("Kokpheng");
		(student1.getStudentCertification()).add(studentCertification1);

		N05_Student student2 = new N05_Student();
		student2.setStudent_name("Kokpheng");
		(student2.getStudentCertification()).add(studentCertification2);

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		session.beginTransaction();

		session.save(student1);
		session.save(student2);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}
}
