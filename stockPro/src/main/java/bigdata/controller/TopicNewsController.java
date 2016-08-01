package bigdata.controller;

import java.util.List;

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
	
	@RequestMapping(value="/bigdata.do", method=RequestMethod.GET)
	public ModelAndView topicnews(HttpServletRequest req){
		ModelAndView mav=new ModelAndView();
		System.out.println("��Ʈ�ѷ� ����");
		List<BigdataDTO> topiclist=service.getTopicnews();
		List<BigdataDTO> industrylist=service.getIndustrynews();
		for(int i=0;i<topiclist.size();i++){
			System.out.println(topiclist.get(i));
		
		
		}
		mav.addObject("topiclist",topiclist);
		mav.addObject("industrylist",industrylist);
		mav.setViewName("bigdata");
		return mav;
		
	}
	

}

