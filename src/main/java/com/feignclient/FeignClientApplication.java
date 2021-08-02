package com.feignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableFeignClients
//@RestController
public class FeignClientApplication {

//	@Autowired
//	private UserClient userClient;
	
	public static void main(String[] args) {
		SpringApplication.run(FeignClientApplication.class, args);
	}
	
//	@GetMapping("/findAllUser")
//	public List<User> getAllUsers(){
//		return userClient.getUsers();
//	}

}
