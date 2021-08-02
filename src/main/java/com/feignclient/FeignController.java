package com.feignclient;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feignclient.client.UserClient;
import com.feignclient.dto.User;
import com.feignclient.repository.UserRepo;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@EnableFeignClients
@Slf4j
public class FeignController {

	public List<User> userList = new ArrayList<User>();
	public List<User> savedUsers = new ArrayList<User>();

	@Autowired
	private UserClient userClient;

	@Autowired
	private UserRepo userRepo;

	@GetMapping("/users")
	public List<User> getUsers() {
		log.info("fetching users");
		userList = userClient.getUsers();
		for (User user : userList) {
			savedUsers.add(userRepo.save(user));
		}
		return savedUsers;
	}

//	@PostMapping("/users")
//	public List<User> saveUsers(@RequestBody List<User>users){
//		return userService.saveUsers(users);
//	}

}
