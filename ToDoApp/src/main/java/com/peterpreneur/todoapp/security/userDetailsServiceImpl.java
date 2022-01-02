package com.peterpreneur.todoapp.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.peterpreneur.todoapp.domain.User;
import com.peterpreneur.todoapp.repositories.UserRepository;

public class userDetailsServiceImpl implements UserDetailsService{
	@Autowired
	private UserRepository userRepo;
		
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
	{
		User user = userRepo.findByUserName(username);
		if (user == null)
			throw new UsernameNotFoundException("User with username: " + username + " not found");
			
		return new CustomSpringUser(user);
	}

}
