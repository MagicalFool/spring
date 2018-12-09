package com.cc.work;

import org.springframework.stereotype.Component;

@Component
public class WorkStream {

  private boolean aBoolean ;

  private WorkStream self;

  public WorkStream() throws Exception {
  }

  public WorkStream start(){
    aBoolean = false;
    self = this;
    return self;
  }

  public WorkStream optional(Object o1,Object o2,Exception e) throws Exception {
    aBoolean = o1.equals(o2);
    if (e!=null && !aBoolean ){
      throw e;
    }
    return  self;
  }

  public WorkStream optional(Object o1,Object o2) throws Exception {
    return optional(o1,o2,null);
  }

  public WorkStream isEmpty(Object o1) throws Exception {
    if (o1 instanceof CharSequence){
      String temp = (String) o1;
      if (temp==null || temp.length() == 0){
        aBoolean = true;
      }else {
        aBoolean = false;
      }
    }else {
      throw new Exception();
    }
    return self;
  }

  public boolean end(){
    try
    {
      return aBoolean;
    }finally {
      try {
        self.finalize();
      } catch (Throwable throwable) {
        throwable.printStackTrace();
      }
    }
  }

  public Boolean getResult(){
    return aBoolean;
  }

  public WorkStream free(Unlimit unlimit,Exception e) throws Exception {
    aBoolean = unlimit.vaild();
    if (e!=null && !aBoolean){
      throw e;
    }
    return self;
  }

  public WorkStream free(Unlimit unlimit) throws Exception {
    return free(unlimit,null);
  }

//  public Validator execute(){
//
//  }
  public <T>T takeResult(GetResult<T> tGetResult , Exception e) throws Exception {
    if (e!=null && aBoolean){
      throw e;
    }
    return tGetResult.getQuestion();
  }
  public WorkStream line(){
    return self;
  }

}
