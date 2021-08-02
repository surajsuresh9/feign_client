package com.feignclient.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.feignclient.dto.User;

public interface UserRepo extends JpaRepository<User, Long>{

}
