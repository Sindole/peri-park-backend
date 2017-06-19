package com.niit.backend.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backend.model.Category;
import com.niit.backend.model.User;

@Repository(value="categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
		


		public CategoryDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}	
		public CategoryDAOImpl() {
			super();
			// TODO Auto-generated constructor stub
		}

	public boolean saveOrUpdate(Category cat) {
		try {
			Session s=sessionFactory.getCurrentSession();
			Transaction t=s.beginTransaction();
			s.saveOrUpdate(cat);
			t.commit();
			return true;
			}
			
			catch(Exception e)
			{
				e.printStackTrace();
				return false;
			}
	}

	public boolean delete(Category cat) {
		try
		{
			Session s=sessionFactory.getCurrentSession();
			Transaction t=s.beginTransaction();
			s.delete(cat);
			t.commit();
			sessionFactory.getCurrentSession().delete(cat);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	public Category get(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Category> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public Category getById(int id) {
		try
		{
			return sessionFactory.openSession().createQuery("from Category where catid=:id", Category.class).setParameter("catid", id).getSingleResult();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
		
	}

}
