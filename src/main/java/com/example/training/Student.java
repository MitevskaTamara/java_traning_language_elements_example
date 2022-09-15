package com.example.training;

public class Student {

  public static final String NAME = "Name: ";
  public static final String INDEX = ", index: ";
  public static final String CREDITS = ", credits: ";
  public String firstName;
  public String lastName;
  public int index;
  public int credits;

  public Student() {}

  public Student(String firstName, String lastName, int index, int credits) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.index = index;
    this.credits = credits;
  }

  public String print() {
    String emptySpace = " ";
    return NAME + this.firstName + emptySpace + this.lastName + INDEX + this.index + CREDITS + this.credits;
  }

  public void incrementCredits(int number) {
    this.credits = this.credits + number;
  }

//  @Override
//  public int hashCode() {
//    return this.index;
//  }
//
//  @Override
//  public boolean equals(Object obj) {
//    // checking if both the object references are  referring to the same object.
//    if(this == obj)
//      return true;
//
//    if(obj == null || obj.getClass() != this.getClass())
//      return false;
//
//    // type casting of the argument.
//    Student student = (Student) obj;
//
//    // comparing the state of argument with the state of 'this' Object.
//    return student.index == this.index;
//  }
}
