package fundamental.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fundamental.service.FundamentalService;

@Controller
public class PERbandController{
	@Autowired
	FundamentalService service;

	@RequestMapping(value = "/perband.do", method = RequestMethod.GET)
		public ModelAndView list(){
			
			ModelAndView mav = new ModelAndView();
//			mav.addObject("brdlists",service.list());
			mav.setViewName("board");
			return mav;
		}
	}	
