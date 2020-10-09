package com.ramkarlapudi.SpringDataJPA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramkarlapudi.SpringDataJPA.Entity.UserProfileEntity;
import com.ramkarlapudi.SpringDataJPA.Service.UserServiceCrud;
import com.ramkarlapudi.SpringDataJPA.Service.UserServicePagination;

@RestController
@RequestMapping("/Crud")
public class UserControllerCrud {

	@Autowired
	private UserServiceCrud userServiceCrud;

	@Autowired
	private UserServicePagination userServicePagination;

	@PostMapping("/saveUser")
	public void saveUser(@RequestBody UserProfileEntity userProfileEntity) {
		userServiceCrud.save(userProfileEntity);
	}

	@PostMapping("/saveAllUsers")
	public List<UserProfileEntity> saveUser(@RequestBody List<UserProfileEntity> userProfileEntityList) {
		return userServiceCrud.saveAllUsers(userProfileEntityList);
	}

	@GetMapping("/allUsersBYSort")
	public List<UserProfileEntity> getUsersBYSorting() {
		return userServicePagination.getallUsersbySort();

	}
	
	@GetMapping("/allUsersBYSortDesc")
	public List<UserProfileEntity> getUsersBYSortingDesc() {
		return userServicePagination.getallUsersbySortDesc();

	}
	@GetMapping("/getUsersbyPage/{pageid}")
	public List<UserProfileEntity> pagination(@PathVariable("pageid") int pageid){
		return userServicePagination.getUsersbyPage(pageid);
	}

}
