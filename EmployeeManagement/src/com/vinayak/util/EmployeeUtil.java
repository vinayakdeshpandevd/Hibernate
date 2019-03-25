package com.vinayak.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeUtil {
	private static SessionFactory factory = null;
	private static Session session = null;
	private static ThreadLocal<Session> sessions = new ThreadLocal<Session>();
	static {
		factory = new Configuration().configure("conf/configuration.xml").buildSessionFactory();
		System.out.println("Employee util");
	}
	
	public static Session getSession() {
		
		if(sessions.get()!=null)
		{
			return session;
		}else {
			System.out.println("session null");
			session = factory.openSession();
			sessions.set(session);
			
		//	System.out.println("session = "+session);
			return session;
			
			
		}
	}
	
	
	public static void closeSessionFactory() {
		factory.close();
		
	}
	
	public static void closeSession() {
		Session session = sessions.get();
		if(session!=null) {
			sessions.remove();
			session.close();
		}
	}

}
