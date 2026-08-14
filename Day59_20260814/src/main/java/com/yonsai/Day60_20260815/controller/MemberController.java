package com.yonsai.Day60_20260815.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yonsai.Day60_20260815.dto.Person;


// 웹 요청을 처리하는 클래스야!
// DispatcherServlet - 관제탑! (공항)
//  이런 요청들어오면 어떤 컨트롤러가 실행해야되! 

@Controller
public class MemberController {

  @GetMapping("/")
  public String test1(Model 상자) {

    // 동적페이지 필요한거 두개
    // 1. 데이터(값)
    String name = "에리나";
    String email = "example@example.com";
    int age = 20;
    int height = 160;
    String address = "서울시 강남구";
    String phone = "010-1234-5678";
    

    // 2. 컨트롤러 -> HTML파일에게 데이터를 전달할 때 사용하는
    // 타입 Model
    상자.addAttribute("username", name);
    상자.addAttribute("email", email);
    상자.addAttribute("age", age);
    상자.addAttribute("height", height);
    상자.addAttribute("address", address);
    상자.addAttribute("phone", phone);

    // 타임리프테스트폴더 안에 test1.html 페이지 이동
    return "thymeleafTest/test1";
  }

  @GetMapping("/test2")
  public String test2(Model 상자) {

    String name = "그레이스";
    int age = 20;
    double wei = 40.25; 

    상자.addAttribute("name", name);
    상자.addAttribute("age", age);
    상자.addAttribute("wei", wei);

       return "thymeleafTest/test2";
  } 

     @GetMapping("/array")
     public String testArray(Model 상자) {
        
        int[] arr = {1, 2, 3, 4, 5};
        double[] arr2 = {1.1, 2.2, 3.3};
        String[] arr3 = {"김동현", "김나나", "김석동"};
        
        상자.addAttribute("arr", arr);
        상자.addAttribute("arr2", arr2);
        상자.addAttribute("arr3", arr3);

       ArrayList<String> urls = new ArrayList<>();

    urls.add("https://www.naver.com");
    urls.add("https://www.google.com");
    urls.add("https://www.daum.com");

    // url 경로를 모아서 메뉴탭을 만든다.

    // HTML로 url들 보내기
    상자.addAttribute("urls", urls);
          
    ArrayList<String> images = new ArrayList<>();
    images.add("https://images.unsplash.com/photo-1523275335684-37898b6baf30?auto=format&fit=crop&w=600&q=80");
    images.add("https://images.unsplash.com/photo-1542291026-7eec264c27ff?auto=format&fit=crop&w=600&q=80");
    images.add("https://images.unsplash.com/photo-1505740420928-5e560c06d30e?auto=format&fit=crop&w=600&q=80");

    상자.addAttribute("images", images);

     //자바에서 가져오면 상황마다 다르게 만들수있다.
    // 이미지들이 크기가 너무 크기 때문에 실제 Mysql에서 저장이
    // 힘들다. 클라우드 드라이브, AWS S3 이용해서 데이터를 
    // 저장하고 url들을 mysql에 저장해서 자바가 꺼내오는 방식!

       return "thymeleafTest/array";
     }

  @GetMapping("/object")
  public String testObject(Model 상자) {

    ArrayList<Person> persons = new ArrayList<>();
    persons.add(new Person("김민준", 20, "ENFP"));
    persons.add(new Person("이서연", 25, "ISTJ"));
    persons.add(new Person("박지훈", 30, "INTP"));

    상자.addAttribute("persons", persons);

    return "thymeleafTest/object";
  }
     
 }


/*
 * html 파일은 두가지 종류로 나뉜다.
 * 고정된 페이지 (정적 파일)
 * - 회사소개 페이지 (누가 보든 언제 보든 내용이 항상 똑같다)
 * - 자기소개/포트폴리오 페이지 (본인이 직접 수정하기 전까지는 항상 동일)
 * - 이용약관,개인정보처리방침( 법적 문서라 자주 안 바뀌고 모두한테 동일)
 * - 로고,아이콘,css파일 ,폰트파일 (디자인 요소는 항상 고정)
 * 
 * 매번 바뀌는 페이지(동작 파일)
 * - 네이버 실시간 검색 결과 - 검색어마다 결과가 다름
 * - 쿠팡 "내 주문 내역" - 사용자마다 완전 다른 데이터
 * - 은행 "잔액 조회" - 조회할 때마다 실시간으로 달라짐
 * - 인스타그램 피드 - 새로고침할 때마다 새 게시물이 추가될 수있음
 * - 유튜브 동영상 - 새로고침을 하거나 앱을 다시 켤때마다 새로운 영상!
 * - 로그인 후 - "이서희님 환영합니다."
 * 
 * 매번 바뀌는 페이지를 만들기 위해서 새로운 라이브러리를 추가했다.
 * thymeleaf (타임리프)
 * - 자바의 변수값을 HTML태그 안에 넣어라!
 * - 리액트에서 {변수명} 들어간것처럼(바인딩)
 * 
 * 라이브러리 추가(agents.md) 파일에 포함!
 */
