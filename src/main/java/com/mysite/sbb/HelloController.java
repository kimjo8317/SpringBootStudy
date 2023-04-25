package com.mysite.sbb;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
//HelloController 클래스가 컨트롤러의 기능을 수행
public class HelloController {
    //Get 방식의 URL 요청은 GetMapping을 사용하고
    //Post 방식의 URL 요청은 PostMapping을 사용한다.
    @GetMapping("/hello")
    //localhost:8080/hello url요청이 발행하면 hello메서드가 실행
    //hello URL과 hello 메서드를 매핑하는 역할을 한다.
    @ResponseBody
    //@ResponseBody=hello메서드의 응답결과가 문자열 그자체를 나타냄
    public String hello(){
        return "Hello Spring Boot Board";
        //보통 html파일과같은 템플릿을 응답결과로사용
    }
}
