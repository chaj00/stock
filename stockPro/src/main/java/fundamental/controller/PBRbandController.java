package fundamental.controller;

import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fundamental.service.FundamentalService;

@Controller
public class PBRbandController extends HttpServlet{
	@Autowired
	FundamentalService service;

	@RequestMapping(value = "/pbrband.do", method = RequestMethod.GET)
	public ModelAndView list(){
		
		ModelAndView mav = new ModelAndView();
//		mav.addObject("brdlists",service.list());
		mav.setViewName("board");
		return mav;
	}
}
