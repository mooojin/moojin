package com.mjkim.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}

/*
 @RestController
   - 해당 컨트롤러를 JSON을 반환하는 컨트롤러로 만들어준다.
   - Spring에서 각 메소드마다 @ResponseBody를 선언했던것을 한번에 사용할 수 있게 해준다.

 @GetMapping
   - Http Method인 Get요청을 받을수 있는 API를 만들어준다.
   - 예전 Spring에서 @RequestMapping(method = RequestMethod.GET) 사용되었다.
* */