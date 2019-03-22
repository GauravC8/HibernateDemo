package com.niit.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserDAO {

	public static void main(String[] args)
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session= sf.openSession();
		Transaction t = session.beginTransaction();
		User u1 =new User();
		u1.setName("Gaurav");
		u1.setPassword("Password");
		u1.setEmail("gaurav@gmail.com");
		session.save(u1);
		t.commit();
		System.out.println("Successfully saved");
	}
}
