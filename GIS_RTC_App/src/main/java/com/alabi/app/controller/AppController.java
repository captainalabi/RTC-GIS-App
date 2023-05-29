package com.alabi.app.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.alabi.app.entity.User;
import com.alabi.app.service.UserService;

@Controller
public class AppController {

	private UserService userService;
	
	@Autowired
	public AppController(UserService userService) {//constructor
		super();
		this.userService = userService;
	}

	@GetMapping({"/list-users", "/listAllUsers"})//show all users
	public ModelAndView listTmployees() {
		
		ModelAndView mav = new ModelAndView("listAllUsers");
		List <User> user = userService.readUsers(); 
		mav.addObject("user", user);
		
		return mav;
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute User user) {//saves user to database
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("user-data");
		modelAndView.addObject("user", user);
		
		userService.createUser(user);
		return modelAndView;
	}
	
	@GetMapping("/index_page")//link for index page
	public String index_page() {
		
		return "index";
	}
	
	@GetMapping("/login_page")//link for login
	public String login_page() {
		
		return "login_page";
	}
	
	@GetMapping("/sign_up_page")//link for sign-up
	public String sign_up_page() {
		
		return "sign_up_page";
	}
	
	@RequestMapping(value = "/showUpdateForm", method = RequestMethod.GET)
	public ModelAndView showUpdateForm(@RequestParam String userEmail) {//updates user in database
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("sign_up_page");
		
		User user = userService.findUserByEmail(userEmail);
		modelAndView.addObject("user", user);
		
		return modelAndView;
	}
	
	@GetMapping("/deleteUser")//delete a user
	public String deleteUserByEmail(@RequestParam String userEmail) {
		userService.deleteUserByEmail(userEmail);
		
		return "redirect:listAllUsers";
	}
}
