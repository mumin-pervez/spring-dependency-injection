package com.mumin.springdi.simpledi;

public class Student {

  private String stdName; //Literal dependency

  public void setStdName(String stdName) {
    this.stdName = stdName;
  }

  public void displayInfo() {
    System.out.println("Student Name: " + stdName);
  }

}
