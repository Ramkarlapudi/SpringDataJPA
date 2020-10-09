package com.ramkarlapudi.SpringDataJPA.Service;

import java.util.ArrayList;
import java.util.Optional;

import com.ramkarlapudi.SpringDataJPA.Entity.UserProfileEntity;

public interface UserService {
	
	public  ArrayList<UserProfileEntity> getAllUsers();
	
    public Optional<UserProfileEntity>  getUserById(int id );	

}
