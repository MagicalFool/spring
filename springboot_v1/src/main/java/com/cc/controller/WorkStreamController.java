package com.cc.controller;

import com.cc.bean.Person;
import com.cc.service.StreamService;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WorkStreamController {

  @Autowired
  private StreamService streamService;

  @Resource
  private Person  person;

  @RequestMapping("/getName.do")
  @ResponseBody
  public String getName(){
    try {
      return streamService.TaskOne(person);
    } catch (Exception e) {
      return "error";
    }
  }
}
