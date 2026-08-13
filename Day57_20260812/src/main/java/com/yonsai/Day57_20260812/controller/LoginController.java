package com.yonsai.Day57_20260812.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 스프링한테 알려준다. 
// 나 로그인에 관련된 url들을 처리하는 클래스야!

@RestController
public class LoginController {

	@GetMapping("/login")
	public String login() {
		return "Login처리함";
		
	}
}
