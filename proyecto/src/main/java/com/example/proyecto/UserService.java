package com.example.proyecto;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

	@Autowired
	UserRepository repository;
	
	
	public Iterable<User> findAll() {
		
		return repository.findAll();
	}
	
	public void insertUser(User user) {
		
		repository.save(user);
	}
	
	


}