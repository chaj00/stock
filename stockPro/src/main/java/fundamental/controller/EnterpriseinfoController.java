package fundamental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fundamental.dto.EnterpriseTotalDTO;
import fundamental.service.FundamentalService;
import fundamental.service.FundamentalServiceImpl;

@Controller
public class EnterpriseinfoController {
	@Autowired
	FundamentalService service;

	@RequestMapping(value = "/enterpriseinfo.do", method = RequestMethod.GET)
	public ModelAndView list(){
		
		ModelAndView mav = new ModelAndView();
		List<EnterpriseTotalDTO> codelist = service.codelist();
//		mav.addObject("enterpriseinfo",service.enterpriseinfo(code));
		mav.setViewName("enterpriseinfo");
		return mav;
	}
}
