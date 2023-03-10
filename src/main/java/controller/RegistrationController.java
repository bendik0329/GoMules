package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.RegistrationModel;
import service.RegistrationManager;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

	// Service RegistrationManager has been auto-wired so an object can create.
	@Autowired
	RegistrationManager registrationManager;

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView register(@ModelAttribute RegistrationModel registration) {
		// Error handling here
		// Model validation
		// Common Error pop-up mechanism

		int result = registrationManager.Register(registration);

		ModelAndView model = new ModelAndView();
		if (result > 0)
		{
			model.addObject("message", true);
			model.setViewName("login");
		}
		else
		{
			model.addObject("message", true);
			model.setViewName("registration");
		}

		model.addObject("loginModel", new RegistrationModel());


		return model;
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Model model) // what else and better we can use instead of this Model?
	{
		// http://javawebtutor.com/articles/spring/spring-mvc-hibernate-crud-example.php

		model.addAttribute("RegistrationModel", new RegistrationModel());
		return "registration";
	}
	

	/*
	 * @RequestMapping(value="/dashboard",method=RequestMethod.GET) public String
	 * dashboard() //what else and better we can use instead of this Model? { return
	 * "ridePostings"; }
	 */
}
/* Some notes */
/* @RequestMapping({"/hello", "/hi", "/greetings"}) */
/*
 * public String doLogin(@RequestParam String username,
 * 
 * @RequestParam String password) {
 * 
 * }
 */
/*
 * @RequestMapping("/listUsers") public ModelAndView listUsers() {
 * 
 * List<User> listUser = new ArrayList<>(); // get user list from DAO...
 * 
 * ModelAndView modelView = new ModelAndView("UserList");
 * modelView.addObject("listUser", listUser);
 * 
 * return modelView; }
 */

/*
 * if (!isLogin) { return new ModelAndView("redirect:/login"); }
 */

/*
 * @Controller public class RegistrationController { ? ????@RequestMapping(value
 * = "/doRegister", method = RequestMethod.POST) ????public String doRegister(
 * ????????@ModelAttribute("userForm") User user, BindingResult bindingResult) {
 * ? ????????if (bindingResult.hasErrors()) { ????????????// form validation
 * error ? ????????} else { ????????????// form input is OK ????????} ?
 * ????????// process registration... ? ????????return "Success"; ????} }
 */

/*
 * http://www.codejava.net/frameworks/spring/14-tips-for-writing-spring-mvc-
 * controller
 */