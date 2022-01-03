package com.peterpreneur.todoapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peterpreneur.todoapp.domain.ToDo;
import com.peterpreneur.todoapp.domain.User;

public interface ToDoRepository extends JpaRepository<ToDo, Long>
{
	public ToDo findByTaskAndUser(String task, User user);
}
