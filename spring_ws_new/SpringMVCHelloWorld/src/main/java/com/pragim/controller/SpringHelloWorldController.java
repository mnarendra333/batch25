package com.pragim.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringHelloWorldController {
	
	
	
		@RequestMapping(path = "/hello")
		public ModelAndView sayHello() {
			//logic 
			String message = "Welcome to Spring MVC Tutorials";
			return new ModelAndView("success", "key", message);
		}
		
		@RequestMapping(path = "/")
		public ModelAndView homePage() {
			//logic 
			return new ModelAndView("index", "key", "test");
		}

}
