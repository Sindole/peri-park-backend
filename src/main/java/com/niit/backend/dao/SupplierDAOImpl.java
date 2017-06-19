package com.niit.backend.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backend.model.Supplier;

@Repository(value="supplierDAO")
public class SupplierDAOImpl implements SupplierDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public SupplierDAOImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SupplierDAOImpl(SessionFactory sessionFactory)
	{
		super();
		this.sessionFactory=sessionFactory;
	}

	public boolean saveOrUpdate(Supplier sup) {
		try{
		Session s=sessionFactory.getCurrentSession();
		Transaction t=s.beginTransaction();
		s.saveOrUpdate(sup);
		t.commit();
		return true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(Supplier sup) {
		// TODO Auto-generated method stub
		return false;
	}

	public Supplier get(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Supplier> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public Supplier getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
