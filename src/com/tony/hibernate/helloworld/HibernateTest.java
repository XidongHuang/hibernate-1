package com.tony.hibernate.helloworld;


import org.hibernate.SessionFactory;
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
		Configuration configuration = new Configuration().configure();
		
		
		//Before Hibernate 4.0, sessionFactory is created like this:
		//sessionFactory = configuration.buildSessionFactory();
		
		
		//2) Create ServiceRegistry Object: Hibernate 4.x new add object
		//hibernate's every configuration and servers all need to be registered then be working
		
		ServiceRegistry serviceRegistry = null;
		
		//2. Create a Session Object
		

		
		//3. Start case
		
		
		//4. Save Operation
		
		
		//5. Submit case
		
		
		
		//6. Close Session
		
		
		//7. Close SessionFactory object
	
	}

}
