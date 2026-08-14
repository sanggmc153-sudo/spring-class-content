package com.yonsai.Day60_20260815.dto;

public class Person {
  public String name;
  public int age;
  public String mbti;

  public Person() {
  }

  public Person(String name, int age, String mbti) {
    this.name = name;
    this.age = age;
    this.mbti = mbti;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getMbti() {
    return mbti;
  }

  public void setMbti(String mbti) {
    this.mbti = mbti;
  }
}