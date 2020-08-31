package com.home.dao;

import org.hibernate.Session;

import com.home.model.User;
import com.home.util.HibernateUtil;

public class UserDao {

	public void createUser(User user) {
		try (Session session=HibernateUtil.getSessionFactory().openSession()){
			
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
