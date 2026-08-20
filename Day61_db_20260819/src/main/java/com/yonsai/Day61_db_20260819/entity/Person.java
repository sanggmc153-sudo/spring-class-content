package com.yonsai.Day61_db_20260819.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// JDA
// - sql코드 자동으로 작성해줌
// - 테이블도 자동으로 생성해줌
// - 데이터베이스에 관한 모든 내용은 자동화해줄래?

// 내가 클래스로 틀 만들어놓을깨 그대로 생성해줘! 
// 테이블 생성시 대표키! 성정해달라 primary key
@Entity
public class Person {
    // 대표키(PK)
    @Id
    private int id;

    private String name;
    private int age;
}

// 원래 @Column 변수들 위에 다 붙여야 한다. 