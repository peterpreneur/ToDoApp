package com.peterpreneur.todoapp.domain;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.peterpreneur.todoapp.security.Authorities;

@Entity
@Table(name="users")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class User 
{
	private Long id;
	private String username;
	private String password;
	private Set<Authorities> authorities = new HashSet<Authorities>();
	private Set<ToDo> toDos = new TreeSet<ToDo>();
	
	public User () {}
	
	public User(User user) {
		this.id = user.id;
		this.username = user.username;
		this.authorities = user.authorities;
		this.authorities = user.authorities;
		this.toDos = user.toDos;
	}
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL, mappedBy="user1")
	public Set<Authorities> getAuthorities() {
		return authorities;
	}
	public void setAuthorities(Set<Authorities> authorities) {
		this.authorities = authorities;
	}

	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL, mappedBy="user2")
	public Set<ToDo> getToDos() {
		return toDos;
	}
	public void setToDos(Set<ToDo> toDos) {
		this.toDos = toDos;
	}

	
}
