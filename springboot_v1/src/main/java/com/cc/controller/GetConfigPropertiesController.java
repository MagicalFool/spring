package com.cc.controller;

import com.cc.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GetConfigPropertiesController {

  @Autowired
  private Person person;

  @RequestMapping("/person")
  @ResponseBody
  public Person getPerson(){
    return person;
  }
}
