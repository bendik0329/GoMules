package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index(ModelMap model)
	{
		model.addAttribute("message","Please register");
		return "registration";
		
	}
	
	
}