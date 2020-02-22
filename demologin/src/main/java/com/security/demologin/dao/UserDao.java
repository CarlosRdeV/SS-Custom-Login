package com.security.demologin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.demologin.model.DAOUser;

public interface UserDao extends JpaRepository<DAOUser, Integer>{
	DAOUser findByUsername(String username);

}
