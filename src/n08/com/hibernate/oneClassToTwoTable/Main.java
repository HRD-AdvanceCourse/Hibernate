package n08.com.hibernate.oneClassToTwoTable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		N08_Customer cs = new N08_Customer();
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		
		cs.setCustomerName("Kokpheng");
		cs.setCustomerAddress("1");
		cs.setCreditScroe(780);
		cs.setRewardPoints(10000);
		
		s.save(cs);
		s.getTransaction().commit();
		
		s.close();
		sf.close();
	}

}
