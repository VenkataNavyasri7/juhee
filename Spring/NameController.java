
package com.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NameController {
	@RequestMapping("/name")
	public ModelAndView calc(HttpServletRequest req,HttpServletResponse res){
    String firstname,lastname,fullname;
	firstname=req.getParameter("firstname");
	lastname=req.getParameter("lastname");
	fullname=firstname+" "+lastname;
	String result="";
	result+=fullname;
	return new ModelAndView("result","result",result);
}
}