package com.mumin.springdi.assignment1;

public class Airtel {

  private Service service;

  public void setService(Service service) {
    this.service = service;
  }

  public void activateService() {
    service.providedService();
  }
}
