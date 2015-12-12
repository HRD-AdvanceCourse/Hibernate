package n07.com.hibernate.compoundPrimaryKey;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
	public static void main(String[] args) {
		N07_CompoundKey key1 = new N07_CompoundKey(100, 2000);
		N07_Accounts account1 = new N07_Accounts();
		
		N07_CompoundKey key2 = new N07_CompoundKey(100, 2001);
		N07_Accounts account2 = new N07_Accounts();

		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		account1.setCompoundKeyChpt3(key1);
		account1.setAccountBalance(8500);
		
		account2.setCompoundKeyChpt3(key2);
		account2.setAccountBalance(1500);

		session.save(account1);
		session.save(account2);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
