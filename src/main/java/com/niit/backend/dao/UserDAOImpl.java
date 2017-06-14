package com.niit.backend.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.model.User;
@Repository(value="userDAO")
public class UserDAOImpl implements UserDAO {

@Autowired
private SessionFactory sessionFactory;
	


	public UserDAOImpl(SessionFactory sessionFactory) {
	super();
	this.sessionFactory = sessionFactory;
}

	public UserDAOImpl() {
	super();
	// TODO Auto-generated constructor stub
}

	public boolean saveOrUpdate(User user) {
		try {
		Session s=sessionFactory.getCurrentSession();
		Transaction t=s.beginTransaction();
		s.saveOrUpdate(user);
		t.commit();
		return true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}
@Transactional
	public boolean delete(User user) {
		try
		{
			Session s=sessionFactory.getCurrentSession();
			Transaction t=s.beginTransaction();
			s.delete(user);
			t.commit();
			//sessionFactory.getCurrentSession().delete(user);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}

	public User get(String email) {
		try
		{
			return sessionFactory.openSession().createQuery("from User where email=:email", User.class).setParameter("email", email).getSingleResult();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
	}

	public List<User> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
