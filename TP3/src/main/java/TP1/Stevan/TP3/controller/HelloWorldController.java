package TP1.Stevan.TP3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	@GetMapping("/greeting") // étape 13 1) partie du code qui apelle /greeting
	
	public String greeting(
			@RequestParam(name="nameGET", required=false, defaultValue="World")
			String nameGET, Model model) {
				model.addAttribute("nomTemplate", nameGET); // il faut utiliser "nameGET = ENSIM"
				return "greeting";
			}
	}

