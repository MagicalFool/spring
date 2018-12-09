package com.cc.service;

import com.cc.bean.Person;
import com.cc.work.WorkStream;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class StreamService {

  @Resource
  private WorkStream workStream;

  // 设想一个列子 如果当前某个人的狗有三条 就给最中间的狗取个名字
  public String TaskOne(Person person) throws Exception {
    return workStream.start()
        .free(() -> person.getBooks().size() > 0)
        .line()
        .optional(person.getMap().get("1"), person.getMap().get("2"))
        .line()
        .takeResult(() -> { return person.getAge();}, new Exception("测试1"));
  }
}
