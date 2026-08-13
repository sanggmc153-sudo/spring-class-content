package com.yonsai.Day57_20260812_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EdiyaController {

	@GetMapping("/ediya")
	public String main() {
		return "이디야 메인페이지입니다";
	}
	
	@GetMapping("/menu")
	public String menu() {
		return "메뉴페이지입니다";
	}
	
	@GetMapping("/drink")
	public String drink() {
		return "drink페이지입니다";
	}
}
