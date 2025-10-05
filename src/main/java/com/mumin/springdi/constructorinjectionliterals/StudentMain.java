package com.mumin.springdi.constructorinjectionliterals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    Student abr = (Student) context.getBean("student1");
    abr.displayStdInfo();

    Student sab = (Student) context.getBean("student2");
    sab.displayStdInfo();
  }

}
