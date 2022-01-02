package com.peterpreneur.todoapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ToDo implements Comparable<ToDo> {
	private Long id;
	private String task;
	private Boolean done;
	private Integer priority;
	private User user2;

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Boolean getDone() {
		return done;
	}

	public void setDone(Boolean done) {
		this.done = done;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@ManyToOne
	public User getUser2() {
		return user2;
	}
	public void setUser2(User user2) {
		this.user2 = user2;
	}

	
	@Override
	public int compareTo(ToDo toDo) {
		int a = this.done.compareTo(toDo.done);
		if (a == 0) {
			int b = this.priority.compareTo(toDo.priority);
			if (b == 0) {
				return this.id.compareTo(toDo.id);
			} else {
				return b;
			}
		} else {
			return a;
		}
	}

}
