package com.goalife.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.goalife.dao.GoalifeDao;



@Controller
public class MainController {
	
	@Autowired
	GoalifeDao goalifeDao;
	
	@RequestMapping(value = "/loadPublicGoalsOnLogInPage")
	public ModelAndView displayLoginPage() {
		//Retrieve available public goals to display in loginpage
		//List<Goal> goalList = new ArrayList<Goal>();
		//ModelAndView goalToDisplay = new ModelAndView("loginpage", "goallist",goalList);
		ModelAndView goalToDisplay = new ModelAndView("loginpage", "goallist","LIST GOSE HERE");
		return goalToDisplay;
		
	}


}
