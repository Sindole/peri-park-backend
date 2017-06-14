package com.niit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.dao.UserDAO;
import com.niit.backend.model.User;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
context.scan("com");
context.refresh();

UserDAO userDAO=(UserDAO)context.getBean("userDAO");
User user=(User)context.getBean("user");
user.setAddress("BS Maktha");
user.setConpassword("omnamah");
user.setEmail("edgarsindole@gmail.com");
user.setPassword("omnamah");
user.setPhone(990873072);
user.setRole("ROLE_USER");
//user.setUserid(1);
user.setUsername("edgar");
userDAO.saveOrUpdate(user);
System.out.println("Saved");
/*user=userDAO.get("sindole777@gmail.com");
System.out.println(user.getUsername());*/
/*userDAO.delete(user);
System.out.println(user.getUsername());*/
	}

}
