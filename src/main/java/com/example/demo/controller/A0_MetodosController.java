package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Persona;

@Controller
@RequestMapping("/")
public class A0_MetodosController {
	
	//método1
	//@RequestMapping(value="/metodo1", method=RequestMethod.GET) //VERSIÓN ANTIGUA DE @INSTRUCCIÓN
	@GetMapping("/metodo1")
	public String metodo1(Model model) {
		model.addAttribute("persona", new Persona("Cooler", 123124453));
		return "vista1";
	}
	
	//método2 : DEVUELVE UN OBJ DE TIPO 
	//ModelAndView: ES UNACLASE CREADA POR SPRING QUE PERMITE DEVOLVER TANTO UN MODELO COMO UNA VISTA, CON UN ÚNICO VALOR DE RETORNO. SIRVE PARA MANEJAR MODELOS.  
	
	//@RequestMapping(value="/metodo2", method=RequestMethod.GET)  //VERSIÓN ANTIGUA DE @INSTRUCCIÓN
	@GetMapping("/metodo2")
	public ModelAndView metodo2() {
		//PARA PODER MANDAR DATOS DESDE ESTE MÉTODO, CREAMOS OBJ DE TIPO ModelAndView
		ModelAndView mav = new ModelAndView("vista2");
		mav.addObject("persona", new Persona("Freezer", 23423454));
		return mav;
	}
	
	
	@GetMapping("/metodo3")
	public String metodo3(Model model) {
		model.addAttribute("p", getPersonas());
		return "vista3";
	}
	
	
	public List<Persona>getPersonas(){
		List<Persona> p = new ArrayList<Persona>();
		p.add(new Persona("Kshrilin",12312322));
		p.add(new Persona("Androide 18",126712322));
		p.add(new Persona("Androide 16",12785322));
		p.add(new Persona("Rochi",12342322));
		return p;
	}
	
}
