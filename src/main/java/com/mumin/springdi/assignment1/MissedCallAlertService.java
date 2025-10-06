package com.mumin.springdi.assignment1;

public class MissedCallAlertService implements Service {

  @Override
  public void providedService() {
    System.out.println("Missed call alert service");
  }
}
