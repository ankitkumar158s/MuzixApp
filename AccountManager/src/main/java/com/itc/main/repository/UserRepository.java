package com.itc.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itc.main.entity.User;

@Repository

public interface UserRepository extends JpaRepository<User,Integer> {
    

	

	



	User findByUserName(String userName);

	
}
