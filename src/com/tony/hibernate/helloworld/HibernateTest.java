package com.tony.hibernate.helloworld;


import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

public class HibernateTest {

	@Test
	public void test() {
		//1. Create a SessionFactory object
		SessionFactory sessionFactory = null;
		
		//1) Create Configuration object: For hibernate base information and objects mapping information
		StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
		        .configure( "hibernate.cfg.xml" )
		        .build();
		Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
		
		//Before Hibernate 4.0, sessionFactory is created like this:
		//sessionFactory = configuration.buildSessionFactory();
		
		
		//2) Create ServiceRegistry Object: Hibernate 4.x new add object
		//hibernate's every configuration and servers all need to be registered then be working
		
//		ServiceRegistry serviceRegistry = 
//				new StandardServiceRegistryBuilder()
//				.applySettings(configuration.getProperties()).build();
		
		//3)
		sessionFactory = metadata.getSessionFactoryBuilder().build();
		
		
		//2. Create a Session Object
		Session session = sessionFactory.openSession();

		
		//3. Start case
		Transaction transaction = session.beginTransaction();
		
		//4. Save Operation
//		Date d1 = new Date(new java.util.Date().getTime());
//		News news = new News("Java", "Tony", d1);
//		System.out.println(news);
//		session.save(news);
		
		News n1 = session.get(News.class, 1);
		System.out.println(n1);
		//5. Submit case
		transaction.commit();
		
		
		//6. Close Session
		session.close();
		
		//7. Close SessionFactory object
		sessionFactory.close();
	}

}
