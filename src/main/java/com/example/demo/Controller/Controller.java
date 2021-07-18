package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping(value = "/")
    public String qna() {
        System.out.println("/qna");

        return "qna";
    }

    @GetMapping(value = "/modify")
    public String qnaModify() {
        System.out.println("/qnaModify");

        return "qnaModify";
    }

    @GetMapping(value = "/qnalist")
    public String qnaList() {
        System.out.println("/qnaList");

        return "qnaList";
    }
}
