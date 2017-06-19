package com.niit.backend.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backend.model.Product;

@Repository(value="productDAO")
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public ProductDAOImpl(SessionFactory sessionFactory)
	{
		super();
		this.sessionFactory=sessionFactory;
	}

	public ProductDAOImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean saveOrUpdate(Product prod) {
		try{
		Session s=sessionFactory.getCurrentSession();
		Transaction t=s.beginTransaction();
		s.saveOrUpdate(prod);
		t.commit();
		return true;
		}
		
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(Product prod) {
		// TODO Auto-generated method stub
		return false;
	}

	public Product get(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public Product getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
