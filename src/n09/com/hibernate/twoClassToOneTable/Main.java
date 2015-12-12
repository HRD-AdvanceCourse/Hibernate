package n09.com.hibernate.twoClassToOneTable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
	public static void main(String[] args) {
		N09_SchoolDetail schoolDetail = new N09_SchoolDetail();
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		schoolDetail.setPublicSchool(false);
		schoolDetail.setSchoolAddress("101");
		schoolDetail.setStudentCount(300);
		
		N09_School school = new N09_School();
		school.setSchoolName("my school");
		school.setSchoolDetail(schoolDetail);
		
		session.save(school);
		session.getTransaction().commit();
		
		session.close();
		sessionFactory.close();
	}
}

