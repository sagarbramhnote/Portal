package com.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portal.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUsername(String email);
}
