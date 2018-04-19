package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.RegistrationModel;
import service.RegistrationManager;

// Deleted index.jsp page and now this controller taking care of the first request .
// No RequestMapping used on Controller.
// Used on the action.
@Controller
public class DefaultController {

	@Autowired
	RegistrationManager registrationManager;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView("login", "loginModel", new RegistrationModel());
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute RegistrationModel loginModel) {
		List<RegistrationModel> logindetails = registrationManager.Login(loginModel);

		ModelAndView model=new ModelAndView();
		if (logindetails.size() > 0) {
			model.addObject("loginDetails",logindetails);
			model.setViewName("ridePostings");
			return model;
		} else {
			
			model.addObject("loginModel",new RegistrationModel());
			model.addObject("loginFailed",true);
			model.setViewName("login");
		}
		return model;
	}
}
