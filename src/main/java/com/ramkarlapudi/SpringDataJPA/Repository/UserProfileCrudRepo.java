package com.ramkarlapudi.SpringDataJPA.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ramkarlapudi.SpringDataJPA.Entity.UserProfileEntity;

@Repository
public interface UserProfileCrudRepo extends CrudRepository<UserProfileEntity, Integer> {

}
