package n07.com.hibernate.chapter3.compoundPrimaryKey;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
	public static void main(String[] args) {
		CompoundKeyChpt3 key1 = new CompoundKeyChpt3(100, 2000);
		AccountsChpt3 account1 = new AccountsChpt3();
		
		CompoundKeyChpt3 key2 = new CompoundKeyChpt3(100, 2001);
		AccountsChpt3 account2 = new AccountsChpt3();

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
