package n10.com.hibernate.inheritanceMapping.singelTable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		N10_Project project = new N10_Project();
		project.setProjectName("Hibernate");

		N10_Module module = new N10_Module();
		module.setProjectName("Spring");
		module.setModuleName("AOP");

		N10_Task task = new N10_Task();
		task.setProjectName("Jave");
		task.setModuleName("Collection");
		task.setTaskName("ArrayList");
		
		session.save(project);
		session.save(module);
		session.save(task);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
