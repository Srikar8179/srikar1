package com.jwtoken.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwtoken.Model.User;

@Service
public class UserService {

	private List<User> users=new ArrayList<>();

	public UserService() {
		super();
		users.add(new User(UUID.randomUUID().toString(),"srikar","srikar@gmail"));
		
	}
	
	public List<User> getUsers(){
		return users;
	}
}
