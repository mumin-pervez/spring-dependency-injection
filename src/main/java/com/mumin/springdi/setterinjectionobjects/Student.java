package com.mumin.springdi.setterinjectionobjects;

public class Student {

  private Long stdId;
  private MathCheat mathCheat; /*MathCheat mathCheat = new MathCheat(); */// Hard coded

  public void setStdId(Long stdId) {
    this.stdId = stdId;
  }

  public void setMathCheat(MathCheat mathCheat) {
    this.mathCheat = mathCheat;
  }

  public void cheating() {
    mathCheat.doMathCheat();
    System.out.println("Student Id is : " + stdId);
  }

}
