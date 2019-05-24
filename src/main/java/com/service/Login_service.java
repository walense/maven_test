package com.service;

import com.dao.User_table;
import com.model.*;

public class Login_service {
	User user =new User();
	User_table user_t= new User_table();
	boolean service;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;	
		
	}
	public boolean query() 
	{
		User u_table=null;
		user_t.setUser(user);
		u_table=user_t.getUser();
		if(u_table==null)
		{
			System.out.println("无该用户");
			return false;
		}else{
			System.out.println("查询成功");
			return true;
		}
	}
}
