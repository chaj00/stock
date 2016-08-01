package fundamental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FundamentalIndexController {
	@RequestMapping("/fundamental_layout.do")
	public String main(){
		return "fundamental_layout";
		
	}

}
