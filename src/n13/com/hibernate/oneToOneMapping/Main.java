package n13.com.hibernate.oneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration ().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		N13_PersonDetail personDetail = new N13_PersonDetail();
		personDetail.setZipCode("2366");
		personDetail.setJob("IT");
		personDetail.setIncome(2366);

		N13_Person person = new N13_Person();
		person.setPersonName("Kokpheng");

		person.setPersonDetail(personDetail);

		session.save(person);
		//for session.save(personDetail); no need if we set cascadeType

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
