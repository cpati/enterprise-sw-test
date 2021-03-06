package com.enterprisesw.campaign.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/users")
	public List<User> getUsers(){
		return userService.getUsers();
	}

}
