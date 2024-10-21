package com.orhan.spring_boot_todo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.orhan.spring_boot_todo.services.TodoItemService;

@Controller
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
