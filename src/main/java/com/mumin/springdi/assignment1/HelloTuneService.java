package com.mumin.springdi.assignment1;

public class HelloTuneService implements Service {

  @Override
  public void providedService() {
    System.out.println("Hello Tune service is started");
  }
}
