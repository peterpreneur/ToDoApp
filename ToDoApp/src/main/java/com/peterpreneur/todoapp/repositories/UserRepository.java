package com.peterpreneur.todoapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peterpreneur.todoapp.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

	public User findByUserName(String username);

}
