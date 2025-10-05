package com.mumin.springdi.setterinjectionliterals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    Employee anik = context.getBean("employee1", Employee.class);
    anik.displayInfo();

    Employee abdullah = context.getBean("employee2", Employee.class);
    abdullah.displayInfo();

  }

}
