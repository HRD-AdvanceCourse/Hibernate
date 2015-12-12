package n05.com.hibernate.manyToManyMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		StudentManyToManyCertification studentCertification1 = new StudentManyToManyCertification();
		studentCertification1.setCertification_name("Java Certification");

		StudentManyToManyCertification studentCertification2 = new StudentManyToManyCertification();
		studentCertification2.setCertification_name("Oracle DB Certification");

		StudentManyToMany student1 = new StudentManyToMany();
		student1.setStudent_name("Kokpheng");
		(student1.getStudentCertification()).add(studentCertification1);

		StudentManyToMany student2 = new StudentManyToMany();
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
