package com.niit.backend.dao;

import java.util.List;

import com.niit.backend.model.Category;

public interface CategoryDAO {
	
public boolean saveOrUpdate(Category cat);
	
	public boolean delete(Category cat);
	
	public Category get(String name);
	
	public List<Category> list();
	
	public Category getById(int id);
	
}
