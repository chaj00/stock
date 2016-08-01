package fundamental.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fundamental.dto.BpsDTO;
import fundamental.dto.EnterpriseFinanceDTO;
import fundamental.dto.EnterpriseTotalDTO;
import fundamental.dto.StockCloseWDTO;
import fundamental.service.FundamentalService;

@Controller
public class PBRbandController extends HttpServlet{
	@Autowired
	FundamentalService service;
	
	@RequestMapping(value = "/pbrband.do", method = RequestMethod.GET)
	public ModelAndView list(){
		ModelAndView mav = new ModelAndView();
//		int codelistsize = codelist.size();
			
		List<EnterpriseTotalDTO> codeList 		   = service.codelist();
		EnterpriseFinanceDTO 	 enterpriseFinance = service.enterpriseFinance(codeList.get(0).getCode());
		BpsDTO 					 bpsData 		   = service.bps(enterpriseFinance, codeList.get(0).getTotalstock());
		List<StockCloseWDTO> 	 stockCloseList    = service.closelist();
		
		System.out.println("codeList.get(0).getName() : "+codeList.get(0).getName());

		mav.addObject("codeList", codeList);
		mav.addObject("enterpriseFinance",enterpriseFinance);
		mav.addObject("bpsData",bpsData);
		mav.addObject("stockClose",stockCloseList);
		mav.setViewName("chart_pbr");
		return mav;
	}
}


