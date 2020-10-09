package com.ramkarlapudi.SpringDataJPA.Repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.ramkarlapudi.SpringDataJPA.Entity.UserProfileEntity;

@Repository
public interface UserProfileSortandPagingRepo extends PagingAndSortingRepository<UserProfileEntity, Integer> {

	
}
