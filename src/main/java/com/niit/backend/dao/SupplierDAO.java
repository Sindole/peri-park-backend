package com.niit.backend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.backend.model.Supplier;


public interface SupplierDAO {
	
	public boolean saveOrUpdate(Supplier sup);
	public boolean delete(Supplier sup);
	public Supplier get(String name);
	public List<Supplier> list();
	public Supplier getById(int id);

}
