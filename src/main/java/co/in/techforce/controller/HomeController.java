package co.in.techforce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping("/")
	public String test() {

		return "home";
	}

	@GetMapping("/login")
	public ModelAndView login() {

		return new ModelAndView("login");
	}

	@GetMapping("/home")
	public String home() {

		return "index";
	}

}
