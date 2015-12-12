package n12.com.hibernate.inheritanceMapping.tablePerClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		N12_Project project = new N12_Project();
		project.setProjectName("Hibernate");

		N12_Module module = new N12_Module();
		module.setProjectName("Spring");
		module.setModuleName("AOP");

		N12_Task task = new N12_Task();
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
