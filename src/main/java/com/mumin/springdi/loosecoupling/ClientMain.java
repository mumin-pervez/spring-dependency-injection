package com.mumin.springdi.loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientMain {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("looseCouplingConfig.xml");
    Student abir = context.getBean("student1", Student.class);
    abir.cheating();
  }

}
