package com.enterprisesw.campaign.users;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	List<User> users=new ArrayList<>();
	
	public List<User> getUsers() {
		users.add(new User("101","User 1"));
		users.add(new User("102","User 2"));
		return users;
	}

}
	