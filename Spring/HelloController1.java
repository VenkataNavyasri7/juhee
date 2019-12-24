package com.spring;
 import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController1 { 
	
@RequestMapping("/hello")
public ModelAndView sayHello() {
return new ModelAndView("resultpage","message","welcome to Spring");
}
@RequestMapping("/about")
public ModelAndView sayAbout() {
return new ModelAndView("resultpage","message","About Page");
}

@RequestMapping("/contact")
public ModelAndView sayContact() {
return new ModelAndView("resultpage","message","contact");
}

}
