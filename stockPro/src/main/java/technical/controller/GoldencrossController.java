package technical.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import technical.dto.StockDInfoDTO;
import technical.service.TechnicalService;

@Controller
public class GoldencrossController {
	@Autowired
	TechnicalService service;
	
	@RequestMapping(value="/goldencross.do", method=RequestMethod.GET)
	public ModelAndView run(HttpServletRequest req){
		List<StockDInfoDTO> codeList = service.getStockCodeList();
		List<StockDInfoDTO> stockInfoList = service.getStockInfoList(codeList.get(0).getCode());
		System.out.println(stockInfoList.size());
		return new ModelAndView("goldencross","codelist",service.getStockCodeList());
	}

}
