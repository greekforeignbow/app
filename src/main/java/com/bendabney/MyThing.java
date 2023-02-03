package com.bendabney;

public class MyThing {
  
  private String thingName;

  private String getHidden() {
    return "hidden";
  }
  
  public MyThing(String name) {
    thingName = name;
  }
  /**
   * @return
   */
  public String getString() {
    return "hi";
  }
}
