package n16.com.hibernate.criteria;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class N16_CriteriaInClause {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		N16_Worker worker1 = new N16_Worker();
		worker1.setName("Kokpheng");
		worker1.setSalary(300);

		N16_Worker worker2 = new N16_Worker();
		worker2.setName("Lundy");
		worker2.setSalary(400);

		N16_Worker worker3 = new N16_Worker();
		worker3.setName("Thana");
		worker3.setSalary(500);

		N16_Worker worker4 = new N16_Worker();
		worker4.setName("Teckchun");
		worker4.setSalary(600);

		session.save(worker1);
		session.save(worker2);
		session.save(worker3);
		session.save(worker4);
		session.getTransaction().commit();

		//List criteriaList = new ArrayList();
		//criteriaList.add("Kokpheng");
		//criteriaList.add("Thana");

		Criteria criteria = session.createCriteria(N16_Worker.class);
		
		//criteria = criteria.add(Restrictions.in("name", criteriaList));
		criteria = criteria.add(Restrictions.in("name", new String[]{"Kokpheng", "Lundy"}));
		List list = criteria.list();

		System.out.println("____________________");
		for (Object object : list) {
			N16_Worker worker = (N16_Worker) object;
			System.out.println("Name: " + worker.getName());
			System.out.println("ID: " + worker.getId());
			System.out.println("Salary: " + worker.getSalary());
			System.out.println("____________________");
		}
		session.close();
		sessionFactory.close();
	}
}
