package com.mjkim.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 스프링 부트의 자동설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정된다 , 해당위치부터 읽어들이기때문에 해당클래스는 항상 프로젝트의 최상단에 위치해야한다.
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); // 내장 WAS 실행
    }
}
