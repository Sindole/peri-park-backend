package com.niit.backend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.backend.dao.CategoryDAO;
import com.niit.backend.dao.CategoryDAOImpl;
import com.niit.backend.dao.ProductDAO;
import com.niit.backend.dao.ProductDAOImpl;
import com.niit.backend.dao.SupplierDAO;
import com.niit.backend.dao.SupplierDAOImpl;
import com.niit.backend.dao.UserDAO;
import com.niit.backend.dao.UserDAOImpl;
import com.niit.backend.model.Category;
import com.niit.backend.model.Product;
import com.niit.backend.model.Supplier;
import com.niit.backend.model.User;

@Configuration
@ComponentScan("com")
@EnableTransactionManagement
public class ApplicationConfig {

	@Bean(name="datasource")
	public DataSource getDataSource()
	{
		BasicDataSource datasource=new BasicDataSource();
		datasource.setDriverClassName("org.h2.Driver");
		datasource.setUrl("jdbc:h2:tcp://localhost/~/peri_park");
		datasource.setUsername("sindole");
		datasource.setPassword("1234");
		return datasource;
	}
	
	private Properties getHibernateProperties()
	{
		Properties prop=new Properties();
		prop.put("hibernate.show_sql", "true");
		prop.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		prop.put("hibernate.hbm2ddl.auto", "update");
		prop.put("hibernate.current_session_context_class", "thread");
		return prop;
	}
	
	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory(DataSource datasource)
	{
		LocalSessionFactoryBuilder sessBuild = new LocalSessionFactoryBuilder(datasource);
		sessBuild.addProperties(getHibernateProperties());
		sessBuild.addAnnotatedClass(User.class);
		sessBuild.addAnnotatedClass(Category.class);
		sessBuild.addAnnotatedClass(Product.class);
		sessBuild.addAnnotatedClass(Supplier.class);
		return sessBuild.buildSessionFactory();
		
	}
	
	@Autowired
	@Bean(name="transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager htm=new HibernateTransactionManager(sessionFactory);
		return htm;
	}
	
	
	@Bean(name="userDAO")
	public UserDAO getUserDAOImpl(SessionFactory sess)
	{
		return new UserDAOImpl();
	}
	
	@Bean(name="user")
	public User getUser(SessionFactory sess)
	{
		return new User();
	}
	
	@Bean(name="categoryDAO")
	public CategoryDAO getCategoryDAOImpl(SessionFactory sess)
	{
		return new CategoryDAOImpl();
	}
	
	@Bean(name="cat")
	public Category getCategory(SessionFactory sess)
	{
		return new Category();
	}
	
	@Bean(name="productDAO")
	public ProductDAO getProductDAOImpl(SessionFactory sess)
	{
		return new ProductDAOImpl();
	}
	
	@Bean(name="prod")
	public Product getProduct(SessionFactory sess)
	{
		return new Product();
	}
	
	@Bean(name="supplierDAO")
	public SupplierDAO getSupplierDAOImpl(SessionFactory sess)
	{
		return new SupplierDAOImpl();
	}
	
	@Bean(name="sup")
	public Supplier getSupplier(SessionFactory sess)
	{
		return new Supplier();
	}
	
}
