package n11.com.hibernate.inheritanceMapping.joined;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		N11_Project project = new N11_Project();
		project.setProjectName("Hibernate");

		N11_Module module = new N11_Module();
		module.setProjectName("Spring");
		module.setModuleName("AOP");

		N11_Task task = new N11_Task();
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
