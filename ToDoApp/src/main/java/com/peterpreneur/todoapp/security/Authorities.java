package com.peterpreneur.todoapp.security;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.security.core.GrantedAuthority;

import com.peterpreneur.todoapp.domain.User;

@Entity
public class Authorities implements GrantedAuthority
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7553637597538865785L;
	private Long id;
	private String authority;
	private User user1;
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	@ManyToOne
	public User getUser1() {
		return user1;
	}
	public void setUser1(User user1) {
		this.user1 = user1;
	}
	


}
