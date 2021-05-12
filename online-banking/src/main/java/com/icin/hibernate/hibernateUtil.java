package com.icin.hibernate;



import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.icin.main.Admin;
import com.icin.main.Request;
import com.icin.main.User;
import com.icin.main.Account;





public class hibernateUtil {
	
	
	public String getadminUername() {
		Session session = createSessionFactory().openSession();

		session.beginTransaction();

		Query<Admin> query = session.createQuery("from Admin");
		Admin admin = query.list().get(0);

		session.getTransaction().commit();
		session.close();

		return admin.getAdminUername();
	}
	

	public String getadminPassword() {
		Session session = createSessionFactory().openSession();

		session.beginTransaction();

		Query<Admin> query = session.createQuery("from Admin");
		Admin admin = query.list().get(0);

		session.getTransaction().commit();
		session.close();

		return admin.getAdminPassword();
	}

	public String setuserPassword(String userPassword) {
		Session session = createSessionFactory().openSession();

		session.beginTransaction();

		User user = session.get(User.class, 1);
		user.setUserPassword(userPassword);

		session.getTransaction().commit();
		session.close();

		return user.getUserPassword();
	}

	
	
	
	public String getuserName() {
		Session session = createSessionFactory().openSession();

		session.beginTransaction();

		Query<User> query = session.createQuery("from User");
		User user = query.list().get(0);

		session.getTransaction().commit();
		session.close();

		return user.getUserName();
	}
	

	public String getuserPassword() {
		Session session = createSessionFactory().openSession();

		session.beginTransaction();

		Query<User> query = session.createQuery("from User");
		User user = query.list().get(0);

		session.getTransaction().commit();
		session.close();

		return user.getUserPassword();
	}
	
	public String getuserStatus() {
		Session session = createSessionFactory().openSession();

		session.beginTransaction();

		Query<User> query = session.createQuery("from User");
		User user = query.list().get(0);

		session.getTransaction().commit();
		session.close();

		return user.getUserStatus();
	}

	
	public boolean requestAccept(String requestBy) {
		Session session = createSessionFactory().openSession();

		session.beginTransaction();

		Query<Request> query = session.createQuery("from Request");
		List<Request> requests = query.list();
		
		for(Request request: requests) {
			if(request.getRequestBy().equals(requestBy)) {
				request.setRequestStatus("false");
				return true;
			}
		}
		
		
		session.getTransaction().commit();
		session.close();
		return false;
		

	}

	
	public boolean disable(String userId) {
		Session session = createSessionFactory().openSession();

		session.beginTransaction();

		Query<User> query = session.createQuery("from User");
		List<User> users = query.list();
		
		for(User user: users) {
			if(user.getUserId().equals(userId)) {
				user.setUserStatus("false");
				return true;
			}
		}
		
		
		session.getTransaction().commit();
		session.close();
		return false;
		

	}
	
	public boolean enable(String userId) {
		Session session = createSessionFactory().openSession();

		session.beginTransaction();

		Query<User> query = session.createQuery("from User");
		List<User> users = query.list();
		
		for(User user: users) {
			if(user.getUserId().equals(userId)) {
				user.setUserStatus("true");
				return true;
			}
		}
		
		
		session.getTransaction().commit();
		session.close();
		return false;
		

	}
	
	

	
	public List<User> getUser() {
		Session session = createSessionFactory().openSession();

		session.beginTransaction();

		Query<User> query = session.createQuery("from User");
		List<User> user = query.list();
		
		session.getTransaction().commit();
		session.close();
		
		return user;
	}
	
	public List<Request> getRequest() {
		Session session = createSessionFactory().openSession();

		session.beginTransaction();

		Query<Request> query = session.createQuery("from Request");
		List<Request> request = new ArrayList<Request>();
		for(Request accoun : query.list()) {
			if(accoun.getRequestStatus().equals("true") ) {
				request.add(accoun);
			}
		}
		
		session.getTransaction().commit();
		session.close();
		
		return request;
	}
	

	public List<Account> getTxn(String userId) {
		Session session = createSessionFactory().openSession();

		session.beginTransaction();

		Query<Account> query = session.createQuery("from Account");
		
		List<Account> account = new ArrayList<Account>();
		for(Account accoun : query.list()) {
			if(accoun.getUserId().equals(userId) ) {
				account.add(accoun);
			}
		}
		
		session.getTransaction().commit();
		session.close();
		
		return account;
	}
	
	private SessionFactory createSessionFactory() {
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(com.icin.main.Admin.class);
		configuration.addAnnotatedClass(com.icin.main.User.class);
		configuration.addAnnotatedClass(com.icin.main.Account.class);

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());

		SessionFactory factory = configuration.buildSessionFactory(builder.build());

		return factory;
	}


}

