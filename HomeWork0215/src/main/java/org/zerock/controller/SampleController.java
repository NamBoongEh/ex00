package org.zerock.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
	public String basic(@ModelAttribute("cookieId") String c) {
		log.info("�α����� ���� �� ����");
		
		return "loginForm";
	}
	
	@RequestMapping("/loginAction")
	public String loginAction(HttpServletResponse response, @ModelAttribute("id") String id, @ModelAttribute("pw") int pw, @ModelAttribute("checkbox") String checkbox ) {
		
		System.out.println("���� ���� ��Ʈ�ѷ� ���̵�� " + id);
		System.out.println("���� ���� ��Ʈ�ѷ� �н������ " + pw);
		System.out.println("���� ���� ��Ʈ�ѷ� üũ�ڽ��� " + checkbox);
		
		Cookie c = new Cookie("saveId",id);
		if(id.equals("aaaa") & pw==1234) {			
			if(!(checkbox.equals("on"))) {
				c.setMaxAge(0);
			}
			response.addCookie(c);			
			return ("index");
		}
		else {
			//�޼��� �ֱ�
			return ("loginForm");
		}
	}
	
	@PostMapping("/index")
	public String basic2(@ModelAttribute("id") String id, @ModelAttribute("pw") int pw, @ModelAttribute("cookie") String cookie) {
		return "index";
	}
}
