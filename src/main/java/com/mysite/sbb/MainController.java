package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/sbb")
    @ResponseBody
    public String index() {
        return "안녕하세요 sbb에 오신것을 환영합니다.";
    }

    @GetMapping("/")
    //root메서드를 추가하고 /url매핑을 했음
    //redirect:<URL> (새로운url로요청되도록 리다이렉트)
    //forward:<URL> (기존요청값들이 유지된상태로 url전환)
    public String root() {
        return "redirect:/question/list";
    }
}