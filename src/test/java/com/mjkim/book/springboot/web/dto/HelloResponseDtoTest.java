package com.mjkim.book.springboot.web.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void isPossibleLombokTest(){
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name,amount);

        //then
        assertThat(dto.getName()).isEqualTo(name); // 1,2
        assertThat(dto.getAmount()).isEqualTo(amount);

    }
}
/*
  1. assertThat
    - assertj라는 테스트 검증 라이브러리의 검증 메소드
    - 검증하고 싶은 대상을 인자로 받는다
    - 메소드 체이닝 지원되어 isEqualTo와 같은 메소드를 이어서 사용가능

  2. isEqualTo
    - assertj의 동등비교 메소드
    - assertThat에 있는 값과 isEqualTo의 값을 비교해서 같을때만 성공
* */