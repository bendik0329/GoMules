package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.RegistrationManager;


@Controller
@RequestMapping("/registration")
public class RegistrationController {

	
	// Service RegistrationManager has been auto-wired so an object can create.
	@Autowired
	RegistrationManager registrationManager;
	
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index(ModelMap model)
	{
		return "registration";
		
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(ModelMap model)
	{
		model.addAttribute("message","Please register");
		return "login";
		
	}
}