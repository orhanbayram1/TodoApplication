package com.orhan.spring_boot_todo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orhan.spring_boot_todo.models.TodoItem;

@Repository
public interface TodoItemRepository extends JpaRepository<TodoItem, Long>{
	
	

}
