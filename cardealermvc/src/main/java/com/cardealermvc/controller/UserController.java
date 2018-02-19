package com.cardealermvc.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cardealermvc.model.Car;
import com.cardealermvc.service.CarService;
import com.cardealermvc.service.DbService;
import com.cardealermvc.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	private UserService userservice;
	private CarService carservice;

	@Autowired(required = true)
	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}

	@Autowired(required = true)
	public void setCarservice(CarService carservice) {
		this.carservice = carservice;
	}

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ModelAndView authenticate(@RequestParam("name") String name, @RequestParam("password") String password)
			throws ClassNotFoundException, SQLException {
		ModelAndView mv = new ModelAndView();
		String message = "Login Failed";
		if (this.userservice.validateUser(name, password)) {
			message = " Login Successful";
			mv.addObject("message", message);
			mv.addObject("carlist", this.carservice.getCars());
			mv.setViewName("welcome");
		} else {
			mv.setViewName("index");
			mv.addObject("message", message);
		}
		return mv;
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView register(@RequestParam("name") String name, @RequestParam("password") String password)
			throws ClassNotFoundException, SQLException {
		ModelAndView mv = new ModelAndView();
		String message = "Registration Failed try again...!!";
		if (this.userservice.insertNewUser(name, password)) {
			message = " Registration Successful ";
			mv.addObject("message", message);
			mv.setViewName("index");
		} else {
			mv.setViewName("register");
			mv.addObject("message", message);
		}
		return mv;
	}
}
