package n15.com.hibernate.manyToManyMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		N15_Delegate delegate1 = new N15_Delegate();
		delegate1.setDelegateName("Alex Rod");
		N15_Delegate delegate2 = new N15_Delegate();
		delegate2.setDelegateName("Linda Berry");
		N15_Delegate delegate3 = new N15_Delegate();
		delegate3.setDelegateName("Jonh Deo");
		N15_Delegate delegate4 = new N15_Delegate();
		delegate4.setDelegateName("James Dean");

		N15_Event Java101 = new N15_Event();
		Java101.setEventName("Java - 101");
		N15_Event cplus101 = new N15_Event();
		cplus101.setEventName("C++ - 101");
		N15_Event math101 = new N15_Event();
		math101.setEventName("Math - 101");
		
		Java101.getDelegates().add(delegate1);
		Java101.getDelegates().add(delegate2);
		Java101.getDelegates().add(delegate3);
		cplus101.getDelegates().add(delegate2);
		cplus101.getDelegates().add(delegate3);
		math101.getDelegates().add(delegate4);
		
		
		session.save(delegate1);
		session.save(delegate2);
		session.save(delegate3);
		session.save(delegate4);
		session.save(Java101);
		session.save(cplus101);
		session.save(math101);
		
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
