package n10.com.hibernate.chapter4.InheritanceMapping.SingelTable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		ProjectChpt4 project = new ProjectChpt4();
		project.setProjectName("Hibernate");

		ModuleChpt4 module = new ModuleChpt4();
		module.setProjectName("Spring");
		module.setModuleName("AOP");

		TaskChpt4 task = new TaskChpt4();
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
