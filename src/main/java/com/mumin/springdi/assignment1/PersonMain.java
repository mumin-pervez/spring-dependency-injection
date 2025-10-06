package com.mumin.springdi.assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("assignment1Config.xml");
    System.out.println("XML config file loaded");

    Airtel airtel = (Airtel) context.getBean("airtel");
    airtel.activateService();
  }
}
