package com.epam.OOP;

public class Animal {
  String color;
  int numberOfPaws;
  boolean hasFur;
  public Animal(String color, int numberOfPaws, boolean hasFur) {
    this.color = color;
    this.numberOfPaws = numberOfPaws;
    this.hasFur = hasFur;
  }
  public String getDescription() {
    String text = "";
    if(hasFur==true) {
      text = "This animal is mostly "+color+". It has "+numberOfPaws+" paws and no fur.";
    } else {
      text = "This animal is mostly "+color+". It has "+numberOfPaws+" paws and a fur.";
    }
    return text;
  }
}
