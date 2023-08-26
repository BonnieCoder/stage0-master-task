package com.epam.OOP;

public class Bird extends Animal {
  public Bird() {
    super.color = "blue";
    super.numberOfPaws = 2;
    super.hasFur = false;
  }
  public String getDescription() {
    String text = "";
    if(hasFur==true) {
      text = "This animal is mostly "+color+". It has "+numberOfPaws+" paws and no fur. Moreover, it has 2 wings and can fly.";
    } else {
      text = "This animal is mostly "+color+". It has "+numberOfPaws+" paws and a fur. Moreover, it has 2 wings and can fly.";
    }
    return text;
  }
}
