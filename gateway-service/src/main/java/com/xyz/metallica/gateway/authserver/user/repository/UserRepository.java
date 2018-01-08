package com.xyz.metallica.gateway.authserver.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xyz.metallica.gateway.authserver.user.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findOneByUsername(String username);
}
