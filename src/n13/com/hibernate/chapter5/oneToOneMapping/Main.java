package n13.com.hibernate.chapter5.oneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration ().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		PersonDetailChpt5 personDetail = new PersonDetailChpt5();
		personDetail.setZipCode("2366");
		personDetail.setJob("IT");
		personDetail.setIncome(2366);

		PersonChpt5 person = new PersonChpt5();
		person.setPersonName("Kokpheng");

		person.setPersonDetail(personDetail);

		session.save(person);
		//for session.save(personDetail); no need if we set cascadeType

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
