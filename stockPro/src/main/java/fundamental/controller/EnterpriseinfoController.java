package fundamental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fundamental.service.FundamentalService;

@Controller
public class EnterpriseinfoController {
	@Autowired
	FundamentalService service;

	@RequestMapping(value = "/enterpriseinfo.do", method = RequestMethod.GET)
	public ModelAndView list(){
		
		ModelAndView mav = new ModelAndView();
//		mav.addObject("enterpriseinfo",service.enterpriseinfo(code));
		mav.setViewName("enterpriseinfo");
		return mav;
	}
}
