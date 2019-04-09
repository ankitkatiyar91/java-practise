package com.externaljar;

import com.aditya.daoImpl.UserDetailDAOImpl;
import com.aditya.domain.UserDetail;


public class ExternalJarTest {

	public static void main(String[] args) {
		
		
		/*UserId id=new UserId();
		id.setId(23);
		id.setFirstName("firstName");
		id.setLastName("lastName");
		
		User user=new User();
		user.setId(id);
		
		new UserAddUtil().addUser(user);*/
		
		UserDetail user=new UserDetail("emailId", "phoneNumber", "name", 20, "gender");
		new UserDetailDAOImpl().addUser(user);
		
		
		
		
	}
}
