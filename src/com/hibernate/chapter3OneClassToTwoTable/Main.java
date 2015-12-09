package com.hibernate.chapter3OneClassToTwoTable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		CustomerChpt3 cs = new CustomerChpt3();
		
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
