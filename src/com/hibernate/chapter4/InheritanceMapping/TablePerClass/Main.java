package com.hibernate.chapter4.InheritanceMapping.TablePerClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		ProjectChpt4TPC project = new ProjectChpt4TPC();
		project.setProjectName("Hibernate");

		ModuleChpt4TPC module = new ModuleChpt4TPC();
		module.setProjectName("Spring");
		module.setModuleName("AOP");

		TaskChpt4TPC task = new TaskChpt4TPC();
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
