package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.example.demo.model.Persona;


@Controller
@RequestMapping("/ejemploPost") 
public class A2_PostController {

	//MÉTODO QUE DEVUELVE FORMULARIO
	@GetMapping("/form") 
	public String form(Model modelo) {
		modelo.addAttribute("persona", new Persona());
		return "formulario";
	}


	//MÉTODO QUE CAPTURA LOS DATOS QUE INSERTEMOS EN EL FORMULARIO
	@PostMapping("/addPersona")
	public ModelAndView Resultados(@ModelAttribute("persona") Persona persona) {
		ModelAndView mav = new ModelAndView("resultados");
		mav.addObject("persona", persona);
		return mav;
	}
	
	
	//MÉTODO PARA HACER REDIRECCIÓN(FORMA 1)
	//@GetMapping("/")//AL SOLO PONER LA BARRA, ENTRARÁ DIRECTAMENTE EN EL FORMULARIO.
	/*public String redirect1() {
		return "redirect:/ejemploPost/form";
	}*/
			
	//MÉTODO PARA HACER REDIRECCIÓN(FORMA 2)
	//USAMOS EL OBJ DE SPRING RedirectView.
	@GetMapping("/")
	public RedirectView redirect2() {
		return new RedirectView("/ejemploPost/form");
	}
}
