package com.niit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.dao.CategoryDAO;
import com.niit.backend.model.Category;

public class CategoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		
		CategoryDAO catDAO=(CategoryDAO)context.getBean("categoryDAO");
		Category cat=(Category)context.getBean("cat");
		
	cat.setCatname("Monitors");
	cat.setCatdesc("We have LED & LCD Monitors with HD Resolution");
	catDAO.saveOrUpdate(cat);
	System.out.println("Inserted");
	
	
	}

}
