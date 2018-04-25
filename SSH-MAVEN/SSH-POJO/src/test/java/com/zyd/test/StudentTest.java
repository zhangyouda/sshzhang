package com.zyd.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

import com.zyd.pojo.Student;

public class StudentTest {
	
	@Test
	public void insertStudent(){
		Configuration configure = new Configuration().configure();
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configure.getProperties()).build();
		SessionFactory sessionFactory = configure.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.getCurrentSession();
		try {
			session.getTransaction().begin();
			Student student = new Student("张",33, 98.7);
			session.save(student);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}
	}
	
	
}
