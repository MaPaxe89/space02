package com.prova.fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prova.fullstack.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
