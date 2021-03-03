package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/") 
public class A1_PeticionesController {
	
	//hacemos petición get desde la primera forma
	//localhost:8080/peticiones1?nombre=María
	
	@GetMapping("/peticiones1")
	public ModelAndView peticiones1(@RequestParam(name="nombre")String nom) {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("nombre", nom);
		return mav;	
	}
	
	
	//hacemos petición get desde la SEGUNDA forma
	//localhost:8080/peticiones1/María
	@GetMapping("/peticiones2/{nombre}")
	public ModelAndView peticiones2(@PathVariable(name="nombre")String nom) {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("nombre", nom);
		return mav;	
	}
	
	
}
