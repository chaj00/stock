package fundamental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import fundamental.dao.FundamentalDAO;
import fundamental.dao.FundamentalMybatisDAOImpl;
import fundamental.dto.EnterpriseTotalDTO;
import fundamental.service.FundamentalService;

@Controller
public class EnterpriselistController {
	@Autowired
	FundamentalService service;

	@RequestMapping(value = "/enterpriselist.do", method = RequestMethod.GET)
	public ModelAndView list(){
		ModelAndView mav = new ModelAndView();
//		mav.addObject("enterpriseinfo", service.EnterpriseList(codelist));
		mav.setViewName("enterpriselist");
		return mav;
	}
}
