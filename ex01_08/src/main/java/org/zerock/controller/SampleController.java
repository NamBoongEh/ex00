package org.zerock.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.SampleDTO;
import org.zerock.domain.SampleDTOList;
import org.zerock.domain.TodoDTO;

import lombok.extern.log4j.Log4j;


@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
	
	/*
	 * @InitBinder public void initBinder(WebDataBinder binder) { SimpleDateFormat
	 * dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	 * binder.registerCustomEditor(java.util.Date.class, new
	 * CustomDateEditor(dateFormat, false)); }
	 */
	
	@RequestMapping("")
	public void basic() {
		log.info("8번쨍........................");
	}
	
	@RequestMapping(value = "/basic", method= {RequestMethod.GET, RequestMethod.POST})
	public void basicGet() {
		log.info("베이직 갯또.............");
	}
	
	@GetMapping("/basicOnlyGet")
	public void basicGet2() {
		log.info("베이직 오직 겟또............");
	}
	
	@GetMapping("/ex01")
	public String ex01(SampleDTO dto) {
		log.info("" + dto);
		return "ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02(@RequestParam("name") String name, @RequestParam("age") int age) {
		
		log.info("니 이름 : " + name);
		log.info("니 나이 : " + age);
		return"ex02";
	}
	
	@GetMapping("/ex02List")
	public String ex02List(@RequestParam("ids") ArrayList<String> ids) {
		log.info("아이디들.... : " + ids);
		return"ex02List";
	}
	
	@GetMapping("/ex02Array")
	public String ex02Array(@RequestParam("ids") String[] ids) {
		log.info("array 아이디스.... : " + Arrays.toString(ids));
		return "ex02Array";
	}
	
	@GetMapping("/ex02Bean")
	public String ex02Bean(SampleDTOList list) {
		log.info("list dtos : " + list);
		return "ex02Bean";
	}
	
	@GetMapping("/ex03")
	public String ex03(TodoDTO todo) {
		log.info("todo" + todo);
		return "ex03";
	}
	
	/*
	 * @GetMapping("/ex04") public String ex04(SampleDTO dto, int page) {
	 * log.info("dto : " + dto); log.info("page : " + page); return "/sample/ex04";
	 * }
	 */
	
	@GetMapping("/ex04")
	public String ex04(SampleDTO dto, @ModelAttribute("page") int page) {
		log.info("dto : " + dto);
		log.info("page : " + page);
		return "/sample/ex04";
	}
	
	@GetMapping("/ex05")
	public void ex05() {
		log.info("/ex05..........");
	}
	
	@GetMapping("/ex06")
	public @ResponseBody SampleDTO ex06() {
		log.info("/ex06............");
		SampleDTO dto = new SampleDTO();
		dto.setAge(29);
		dto.setName("남붕어");
		
		return dto;
	}
	
	@GetMapping("/ex07")
	public ResponseEntity<String> ex07(){
		log.info("/ex07..................");
		
		String msg = "그렇게 안할거다.";
		
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Type", "application/json;charset=UTF-8");
		
		return new ResponseEntity<>(msg, header, HttpStatus.OK);
	}
}
