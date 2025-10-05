package com.mumin.springdi.constructorinjectionliterals;

public class Student {

  private Long stdId;
  private String stdName;
  private String stdDepartment;

  public Student(Long stdId, String stdName, String stdDepartment) {
    this.stdId = stdId;
    this.stdName = stdName;
    this.stdDepartment = stdDepartment;
  }

  public void displayStdInfo() {
    System.out.println("Id: " + stdId);
    System.out.println("Name: " + stdName);
    System.out.println("Department: " + stdDepartment);
    System.out.println();
  }
}
