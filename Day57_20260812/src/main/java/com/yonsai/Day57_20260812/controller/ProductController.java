package com.yonsai.Day57_20260812.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	    // 전체 상품 조회
	@GetMapping("/all")
	public String all() {
		return "전체 상품 조회 완료";
		// Mapping
		// - url이 들어오면 스프링이 url을 보고
		// 어떤 자바 메서드(함수)를 실행할지 연결하는 것!

	}

	    // 상세 페이지조회
	@GetMapping("/detail")
	public String detail() {
		return "상세 페이지 조회 완료";

	}

}
