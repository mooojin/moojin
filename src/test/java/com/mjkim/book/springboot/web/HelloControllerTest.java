package com.mjkim.book.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class) // 1
@WebMvcTest(controllers = HelloController.class) // 2
public class HelloControllerTest {

    @Autowired // 3
    private MockMvc mvc; // 4

    @Test
    public void helloIsReturn() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello")) // 5
                .andExpect(status().isOk()) // 6
                .andExpect(content().string(hello)); // 7
    }
}

/*
 1. @RunWith(SpringRunner.class)
    - 테스트를 진행 할 때 Junit에 내장된 실행자 외에 다른 실행자 실행시킴
    - SpringRunner는 스프링 실행자를 사용
    - 스프링 부트 테스트와 JUnit 사이에 연결자 역할

 2. @WebMvcTest
    - 여러 스프링 테스트 어노테이션 중 Web(Spring MVC)에 집중 할수있는 어노테이션
    - 선언할 경우 @Controller, @ControllerAdivce 등을 사용할수 있음
    - 단, @Service, @Component, @Repository 등은 사용할수 없음

 3. @Autowired
    - 스프링이 관리하는 Bean을 주입받음

 4. private MockMvc mvc
    - 웹 API를 테스트할 때 사용
    - 스프링 MVC 테스트의 시작점
    - 해당 클래스를 통해 Http GET, POST 등에대한 API 테스트 가능

 5. mvc.perform(get("/hello"))
    - MockMvc를 통해 /hello 주소를 HTTP GET 요청할수 있음
    - 체이닝이 지원되어 아래의 검증기능 이어서 선언 가능

 6. .andExpect(status().isOk())
    - mvc.perform 결과 검증, HTTP Header의 Status 검증 (200,404,500 등)

 7. .andExpect(content().string(hello))
    - 응답의 본문이 맞는지 검증한다.
* */