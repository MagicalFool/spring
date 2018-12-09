package com.cc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

  @RequestMapping("/hello.do")
  @ResponseBody
  public String HelloWorld(){
    return "helloWorld";
  }
}
