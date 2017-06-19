package com.niit.backend.dao;

import java.util.List;

import com.niit.backend.model.Product;

public interface ProductDAO {
	
	public boolean saveOrUpdate(Product prod);
	
	public boolean delete(Product prod);
	
	public Product get(String name);
	
	public List<Product> list();
	
	public Product getById(int id);
	

}
