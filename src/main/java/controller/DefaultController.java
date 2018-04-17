package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.RegistrationModel;


// Deleted index.jsp page and now this controller taking care of the first request .
// No RequestMapping used on Controller.
// Used on the action.
@Controller
public class DefaultController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView index()
	{
    return new ModelAndView("login", "loginModel", new RegistrationModel());
	}
}
