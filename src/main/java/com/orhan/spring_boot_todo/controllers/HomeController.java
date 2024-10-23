package com.orhan.spring_boot_todo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.orhan.spring_boot_todo.services.TodoItemService;

@RestController
public class HomeController {

	
	@Autowired
	private TodoItemService todoItemService;
	
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("todoItems", todoItemService.getAll());
		return modelAndView;
	}
}
