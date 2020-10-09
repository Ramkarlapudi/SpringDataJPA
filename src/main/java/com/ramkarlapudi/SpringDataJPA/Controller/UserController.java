package com.ramkarlapudi.SpringDataJPA.Controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramkarlapudi.SpringDataJPA.Entity.UserProfileEntity;
import com.ramkarlapudi.SpringDataJPA.Exception.UserExceptions;
import com.ramkarlapudi.SpringDataJPA.Service.UserServiceImpl;

@RestController
@RequestMapping("/userservice")
public class UserController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@GetMapping("/getusers" )
	public ArrayList<UserProfileEntity> getusers() {
	
		return userServiceImpl.getAllUsers();
		
	}
	@GetMapping("/getuser/{id}" )
	public Optional<UserProfileEntity> getUserById(@PathVariable("id") int id ){
		return userServiceImpl.getUserById(id); 
		
	}
	
	@GetMapping("/getusersbyname/{name}")
	public Optional<UserProfileEntity> getUserbyName(@PathVariable("name")  String name) {
		Optional<UserProfileEntity> userList =	userServiceImpl.getUserBYname(name);
		if(!userList.isPresent())
			 throw new UserExceptions("User Not Found with name: "+ name );
		return userList;
		
	}
	
	@PostMapping("/uploadProfile")
	public UserProfileEntity uploadEntity(@RequestBody UserProfileEntity userProfileEntity ) {
		UserProfileEntity user =	userServiceImpl.uploadUser(userProfileEntity);
		return user;
	}
	
	

}
