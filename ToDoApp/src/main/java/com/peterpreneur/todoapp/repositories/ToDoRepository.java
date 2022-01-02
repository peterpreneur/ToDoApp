package com.peterpreneur.todoapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peterpreneur.todoapp.domain.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo, Long>
{

}
