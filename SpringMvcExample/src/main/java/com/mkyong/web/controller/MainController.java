package com.mkyong.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes({"sound", "sound7"})
public class MainController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index() {

		String sound = "postnotificationsound.mp3";
		ModelAndView model = new ModelAndView("index");
		model.addObject("sound", sound);

		return model;

	}

	@RequestMapping(value = "/sound", method = RequestMethod.GET)
	public ModelAndView sound(@ModelAttribute("sound") String sound) {

		ModelAndView model = new ModelAndView("sound");
		model.addObject("sound7", sound);

		return model;

	}

}
