package com.mumin.springdi.setterinjectionliterals;

public class Employee {

  private Long empId;
  private String empName;
  private String empAddress;

  public void setEmpId(Long empId) {
    this.empId = empId;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public void setEmpAddress(String empAddress) {
    this.empAddress = empAddress;
  }

  public void displayInfo() {
    System.out.println("Id: " + empId);
    System.out.println("Name: " + empName);
    System.out.println("Address: " + empAddress);
    System.out.println();
  }

}
