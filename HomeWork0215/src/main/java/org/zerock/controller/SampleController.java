package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/")
@Log4j
public class SampleController {
	
	/*
	 * @InitBinder public void initBinder(WebDataBinder binder) { SimpleDateFormat
	 * dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	 * binder.registerCustomEditor(java.util.Date.class, new
	 * CustomDateEditor(dateFormat, false)); }
	 */
	
	@RequestMapping("/loginForm")
	public String basic() {
		log.info("¸ÊÇÎ ¹× ½ÇÇà");
		
		return "loginForm";
	}
}
