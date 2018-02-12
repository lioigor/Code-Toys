package com.lioigor22.controllers;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = { "/", "/home" })
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		return "home";
	}

	@RequestMapping(value = "/failed", method = RequestMethod.GET)
	public ModelAndView failed() {
		return new ModelAndView("error", "message", "Login failed!");
	}

	@RequestMapping(value = "/features")
	public String features() {

		return "features";
	}

	@RequestMapping(value = "/contacts")
	public String contacts() {

		return "contacts";
	}

	@RequestMapping(value = "/downloads")
	public String downloads() {

		return "downloads";
	}

	@RequestMapping(value = "/support")
	public String support() {

		return "support";
	}

	@RequestMapping(value = "/login")
	public String login() {

		return "login";
	}

	@RequestMapping(value = "/register")
	public String register() {

		return "register";
	}

}
