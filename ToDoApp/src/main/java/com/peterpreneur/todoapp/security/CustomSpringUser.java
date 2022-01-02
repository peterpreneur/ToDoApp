package com.peterpreneur.todoapp.security;

import java.util.Set;

import org.springframework.security.core.userdetails.UserDetails;

import com.peterpreneur.todoapp.domain.ToDo;
import com.peterpreneur.todoapp.domain.User;

public class CustomSpringUser extends User implements UserDetails
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2511363171117744431L;

	public CustomSpringUser() {}
	public CustomSpringUser(User user) {super(user);}
	
	@Override
	public Long getId() {return super.getId();}
	@Override
	public String getUsername() {return super.getUsername();}
	@Override
	public String getPassword() {return super.getPassword();}
	@Override
	public Set<Authorities> getAuthorities() {return super.getAuthorities();}
	@Override
	public Set<ToDo> getToDos() {return super.getToDos();
	}
	
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
