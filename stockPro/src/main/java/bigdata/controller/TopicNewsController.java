package bigdata.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import bigdata.dto.BigdataDTO;
import bigdata.service.BigdataService;

@Controller
public class TopicNewsController {
	@Autowired
	BigdataService service;

	
	@RequestMapping(value = "/bigdata.do", method = RequestMethod.GET)
	public ModelAndView topicnews(HttpServletRequest req, String ndate) {
		System.out.println("컨트롤러 동작");
		
		if(ndate==null){
			SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
			Date currentTime = new Date();
			ndate = date1.format(currentTime);
		}
		
		ModelAndView mav = new ModelAndView();
		List<BigdataDTO> topiclist;
		List<BigdataDTO> industrylist;
		topiclist = service.getTopicnews(ndate);
		industrylist = service.getIndustrynews(ndate);
		mav.addObject("ndate", ndate);
		mav.addObject("topiclist", topiclist);
		mav.addObject("industrylist", industrylist);
		for(int i=0;i<industrylist.size();i++){
			System.out.println(industrylist.get(i));
		}
		return mav;
		/*if (ndate == null) {
			
			SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
			Date currentTime = new Date();
			String dTime1 = date1.format(currentTime);
			topiclist = service.getTopicnews(dTime1);
			industrylist = service.getIndustrynews(dTime1);
			mav1.addObject("ndate", dTime1);
			mav1.addObject("topiclist", topiclist);
			mav1.addObject("industrylist", industrylist);
			mav1.setViewName("bigdata");
			return mav1;
			
			
		}else if(ndate !=null){
			
			topiclist = service.getTopicnews(ndate);
			industrylist = service.getIndustrynews(ndate);
			mav2.addObject("ndate", ndate);
			mav2.addObject("topiclist", topiclist);
			mav2.addObject("industrylist", industrylist);
			for(int i=0;i<industrylist.size();i++){
				System.out.println(industrylist.get(i));
			}
			mav2.setViewName("bigdata");
			System.out.println("변수" + ndate);
			System.out.println("변수크기" + ndate.length());
			return mav2;
		
		}*/
		

		

	}

}
