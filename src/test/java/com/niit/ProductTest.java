package com.niit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.dao.CategoryDAO;
import com.niit.backend.dao.ProductDAO;
import com.niit.backend.model.Category;
import com.niit.backend.model.Product;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
context.scan("com");
context.refresh();

/*ProductDAO prodDAO=(ProductDAO)context.getBean("productDAO");
Product prod=(Product)context.getBean("prod");

prod.setProdname("Apple LED Monitor");
prod.setPrice(15000);
prod.setCatid(66);
prod.setProddesc("This is an LED Monitor with HD Resolution and dimensions are 24'inches");
prod.setQuantity(2);

prodDAO.saveOrUpdate(prod);
System.out.println("Product Details are entered");*/

	}

}
