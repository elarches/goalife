package com.goalife.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.goalife.dao.GoalifeDao;
import com.goalife.model.User;



@Controller
@SessionAttributes("loggedInUser")
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
	
	//author: Al
	@RequestMapping(value = "/logIn")
	public String logIn(@ModelAttribute User loggedInUser,  BindingResult result, Model model, HttpServletRequest request) {
		loggedInUser = new User();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String page = null;
		boolean existing = goalifeDao.userExists(username, password);
		if(existing){			
			loggedInUser = goalifeDao.retrieveUser(username,password);
			model.addAttribute("loggedInUser",loggedInUser);
			//RETRIEVE ALL ASSOCIATED GOALS AND STUFF, SAVE IT TO SESSION, THEN GO TO HOMEPAGE
			//
			page = "redirect:homepage.html";
		}else{
			result.reject("invalid_user", "no.user");
			page = "loginpage";
		}		
		return page;		
	}
	
	@RequestMapping(value = "/homepage")
	public String home(){
		return "homepage";	
	}
	
	@RequestMapping(value = "/logout")
	public String logout(SessionStatus status){
		status.setComplete();
		return "loginpage";	
	}
	
	


}
