package technical.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import technical.dto.MovingAverageDTO;
import technical.dto.StockDInfoDTO;
import technical.service.TechnicalService;

@Controller
public class GoldencrossController {
	@Autowired
	TechnicalService service;
	
	@RequestMapping(value="/goldencross.do", method=RequestMethod.GET)
	public ModelAndView run(HttpServletRequest req, String mode) throws ParseException{
		//String 타입의 현재 날짜를 구하고 월을 변경
		Date today = new Date (); 
		SimpleDateFormat dayFormat = new SimpleDateFormat ("yyyyMMdd" ); 
		String day = dayFormat.format(today); 
		String month = day.substring(4, 6);
		String newMonth=null;
		if(mode.equals("20")){
			newMonth = Integer.toString((Integer.parseInt(month)-2));
		}else if(mode.equals("60")){
			newMonth = Integer.toString((Integer.parseInt(month)-4));
		}
		
		if(newMonth.equals("0")){
			newMonth="12";
		}else if(newMonth.equals("-1")){
			newMonth="11";
		}else if(newMonth.equals("-2")){
			newMonth="10";
		}else if(newMonth.equals("-3")){
			newMonth="09";
		}
		
		if(newMonth.length()==1){
			newMonth = "0"+newMonth;
		}
		day = day.replace(month, newMonth).trim();
		
		//종목 코드 리스트 저장
		List<String> codeList = service.getStockCodeList();
		
		List<StockDInfoDTO> wholeStockInfoList = new ArrayList<StockDInfoDTO>();
		List<StockDInfoDTO> resultStockInfoList = new ArrayList<StockDInfoDTO>();
		List<MovingAverageDTO> movingAvgList = new ArrayList<MovingAverageDTO>();
		Boolean isGoldencross =false;
		
		List<String> index = new ArrayList<String>();
		
		//지정한 날짜까지 모든 종목의 주식정보 저장
		wholeStockInfoList = service.getWholeStockInfoList(day);
		
		for(int i=0; i<codeList.size();i++){
			
			List<StockDInfoDTO> stockInfoList = new ArrayList<StockDInfoDTO>();
			
			for(int j=0; j<wholeStockInfoList.size();j++){
				if(codeList.get(i).equals(wholeStockInfoList.get(j).getCode())){
					stockInfoList.add(wholeStockInfoList.get(j));
				}
			}
			
			movingAvgList = service.getMovingAvgList(stockInfoList);
			//System.out.println(movingAvgList.size());
			//System.out.println(movingAvgList);
			isGoldencross = service.isGoldencross(movingAvgList, mode);
			
			if(isGoldencross){
				index.add(codeList.get(i));
				resultStockInfoList.add(stockInfoList.get(0));
			}
			
		}
		
		
		// 한 종목씩 DB를 불러와 골든크로스 체크
		/*int listSize = codeList.size();
		for(int i =0; i<listSize;i++){
			String code=codeList.get(i);
			stockInfoList = service.getStockInfoList(code);
			movingAvgList = service.getMovingAvgList(stockInfoList);
			
			isGoldencross = service.isGoldencross(movingAvgList, "20");
			
			if(isGoldencross){
				index.add(code);
			}
		}
		*/
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("mode", mode);
		mav.addObject("resultlist",resultStockInfoList);
		mav.setViewName("goldencross");
		
		System.out.println("완료"+index.size());
		return mav;
	}

}
