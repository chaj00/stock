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
			
		List<EnterpriseTotalDTO> codeList 		   = service.codeList();
		EnterpriseFinanceDTO 	 enterpriseFinance = service.enterpriseFinance(codeList.get(1).getCode());
		BpsDTO 					 bps 		       = service.bps(enterpriseFinance, codeList.get(1).getTotalstock(), codeList.get(1).getCode());
		List<StockCloseWDTO> 	 stockCloseList    = service.stockCloseList(codeList.get(1).getCode());
		List<StockCloseWDTO>	 closeList		   = service.closeList(codeList.get(1).getCode());
		
		System.out.println("close : "+closeList.get(0).getPrice());
		System.out.println("bps : "+bps.getBps06y());
		System.out.println("codeList.get(0).getName() : "+codeList.get(0).getName());
		System.out.println("CONTROLLER!!!!!! : "+stockCloseList);
		
		mav.addObject("closeList", closeList);
		mav.addObject("codeList", codeList);
		mav.addObject("enterpriseFinance",enterpriseFinance);
		mav.addObject("bps",bps);
		mav.addObject("stockCloseList",stockCloseList);
		mav.setViewName("chart_pbr");
		return mav;
	}
}


