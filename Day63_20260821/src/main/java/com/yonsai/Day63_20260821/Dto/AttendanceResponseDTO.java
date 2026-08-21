package com.yonsai.Day63_20260821.Dto;

import java.time.LocalDateTime;

//서비스 자바파일에서 컨트롤러로 데이터 전달할떄 사용
// DTO들!
// 화면에 보이는 데이터는 이름하고 시간만 보인다.
// 화면에 어떤 데이터를 보여줄껀데?
// 스프링 - 역할을 나눠서 개발하는 도구!
// 엔티티 - 테이블(DB)
// dto - 자바 파일들끼리 데이터 전달용!
// 
public class AttendanceResponseDTO {
  private String studentName;
  private LocalDateTime checkTime;
}