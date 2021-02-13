package org.zerock.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
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
		log.info("5噺託 獣切焼焼焼焼焼焦..........");
	}
	
	@RequestMapping(value="/basic", method= {RequestMethod.GET, RequestMethod.POST})
	public void basicGet() {
		log.info("今戚送 惟拭拭拭触拭拭拭拭拭拭拭拭拭色.....");
	}
	
	@GetMapping("/basicOnlyGet")
	public void basicGet2() {
		log.info("今戚送精 紳軒 為............");
	}
	
	@GetMapping("/ex01")
	public String ex01(SampleDTO dto) {
		log.info("" + dto);
		return "ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02(@RequestParam("name") String name, @RequestParam("age") int age) {
		log.info("name: " + name);
		log.info("age: " + age);
		
		return "ex02";
	}
	
	@GetMapping("/ex02List")
	public String exList(@RequestParam("ids")ArrayList<String> ids) {
		log.info("ids: " + ids);
		return "ex02List";
	}
	
	@GetMapping("/ex02Array")
	public String ex02Array(@RequestParam("ids") String[] ids) {
		log.info("array ids: " + Arrays.toString(ids));
		return "ex02Array";
	}
	
	@GetMapping("/ex02Bean")
	public String ex02Bean(SampleDTOList list) {
		log.info("誤陥焼焼焼焼焼焼焼照 : " + list);
		return "ex02Bean";
	}
	
	@GetMapping("/ex03")
	public String ex03(TodoDTO todo) {
		log.info("備拭拭拭拭植: " + todo);
		return "ex03";
	}
	
//	@GetMapping("/ex04")
//	public String ex04(SampleDTO dto, int page) {
//		log.info("dto: " + dto);
//		log.info("page: " + page);
//		return "/sample/ex04";
//	}
	
	@GetMapping("/ex04")
	public String ex04(SampleDTO dto, @ModelAttribute("page") int page) {
		log.info("戚薦澗 蟹臣暗醤焼焼焼: " + dto);
		log.info("遭促稽神神神神: " + page);
		return "/sample/ex04";
	}
	
	@GetMapping("/ex05")
	public void ex05() {
		log.info("/ex05.................");
	}
	
	@GetMapping("/ex06")
	public @ResponseBody SampleDTO ex06() {
		log.info("/ex06........");
		SampleDTO dto = new SampleDTO();
		dto.setAge(209);
		dto.setName("害斎嬢");
		return dto;
	}
	
	@GetMapping("/ex07")
	public ResponseEntity<String> ex07(){
		log.info("/ex07..............");
		
		// {"name" : "戚係惟 拝猿左劃"}
		String msg = "{no English.......!!!!!!!! : study}";
		
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Type", "application/json; carset=UTF-8");
		
		return new ResponseEntity<>(msg, header, HttpStatus.OK);
	}
	
	@GetMapping("/exUpload")
	public void exUpload() {
		log.info("/穣稽球拝暗醤焼焼焼焼");
	}
	
	@PostMapping("/exUploadPost")
	public void exUploadPost(ArrayList<MultipartFile> files) {
		files.forEach(file -> {
			log.info("ばばばばばばばばばばばばばばばばばばばばば");
			log.info("督析戚硯" +  file.getOriginalFilename());
			log.info("督析 紫戚綜" + file.getSize());
			
		});
	}
}
