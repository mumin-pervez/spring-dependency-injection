package com.mumin.springdi.setterinjectionobjects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

  public static void main(String[] args) {
/*    Student student = new Student();
    MathCheat mCheat = new MathCheat();
    student.setMathCheat(mCheat);
    student.cheating();*/
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "SetterInjectionObjectConfig.xml");
    System.out.println("Config file is loaded");

    Student std = context.getBean("student1", Student.class);
    std.cheating();


  }
}
