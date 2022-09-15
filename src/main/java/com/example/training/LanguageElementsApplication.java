package com.example.training;

import java.util.Arrays;

public class LanguageElementsApplication {
  public static final byte byteValue = 2;
  public static final short shortValue = 4;
  public static final int intValue = 100;
  public static final long longValue = 1000;
  public static final float floatValue = 12.7f;
  public static final double doubleValue = 19.99d;
  public static final boolean booleanValue = true;
  public static final char charValue = 'c';

  public static final int[] intArray = new int[10];

  public static void main(String[] args) {
    System.out.println("Command line args:" + Arrays.toString(args));

    printPrimitiveTypes();

    printPrimitiveTypesRange();

    printArrayData();

    executeArithmeticOperations();

    executeComparisonAndLogicalOperations();

    checkIfTwoObjectsAreEqual();
  }

  /**
   * Print primitive types values to console
   */
  private static void printPrimitiveTypes() {
    System.out.println("-------------------------Primitive types-------------------------");

    System.out.println("Byte primitive type: " + byteValue);
    System.out.println("Short primitive type: " + shortValue);
    System.out.println("Int primitive type: " + intValue);
    System.out.println("Long primitive type: " + longValue);
    System.out.println("Float primitive type: " + floatValue);
    System.out.println("Double primitive type: " + doubleValue);
    System.out.println("Boolean primitive type: " + booleanValue);
    System.out.println("Char primitive type: " + charValue);

    System.out.println("-----------------------------------------------------------------");
  }

  private static void printPrimitiveTypesRange() {
    System.out.println("-------------MIN/MAX range for numeric primitive types-----------");

    System.out.println("Byte Datatype values...");
    System.out.println("Min = " + Byte.MIN_VALUE);
    System.out.println("Max = " + Byte.MAX_VALUE);

    System.out.println("Short Datatype values...");
    System.out.println("Min = " + Short.MIN_VALUE);
    System.out.println("Max = " + Short.MAX_VALUE);

    System.out.println("Integer Datatype values...");
    System.out.println("Min = " + Integer.MIN_VALUE);
    System.out.println("Max = " + Integer.MAX_VALUE);

    System.out.println("Long Datatype values...");
    System.out.println("Min = " + Long.MIN_VALUE);
    System.out.println("Max = " + Long.MAX_VALUE);

    System.out.println("Float Datatype values...");
    System.out.println("Min = " + Float.MIN_VALUE);
    System.out.println("Max = " + Float.MAX_VALUE);

    System.out.println("Double Datatype values...");
    System.out.println("Min = " + Double.MIN_VALUE);
    System.out.println("Max = " + Double.MAX_VALUE);
    System.out.println("---------------------------------------------------------------");
  }

  private static void printArrayData() {
    intArray[0] = 0;
    intArray[1] = 1;
    intArray[2] = 2;
    intArray[3] = 3;
    intArray[4] = 4;
    intArray[5] = 5;
    System.out.println(Arrays.toString(intArray));
  }

  private static void executeArithmeticOperations() {
    int firstNumber = 4;
    int secondNumber = 2;

    System.out.println("Addition: " + (firstNumber + secondNumber));
    System.out.println("Subtraction: " + (firstNumber - secondNumber));
    System.out.println("Multiplication: " + (firstNumber * secondNumber));
    System.out.println("Division: " + (firstNumber / secondNumber));
    System.out.println("Modulus: " + (firstNumber % secondNumber));
    System.out.println("Increment: " + firstNumber++);
    System.out.println("Decrement: " + firstNumber--);
  }

  private static void executeComparisonAndLogicalOperations() {
    int firstNumber = 4;

    System.out.println("4==3: " + (firstNumber == 3));
    System.out.println("4!=3: " + (firstNumber != 3));
    System.out.println("4<3: " + (firstNumber < 3));
    System.out.println("4>3: " + (firstNumber > 3));
    System.out.println("4<=3: " + (firstNumber <= 3));
    System.out.println("4>=3: " + (firstNumber >= 3));


    System.out.println("4==3 && 4<5: " + ((firstNumber == 3) && (firstNumber <= 5)) );
    System.out.println("4==3 || 4<5: " + ((firstNumber == 3) || (firstNumber <= 5)));
    System.out.println("4==3 ^ 4<5: " + ((firstNumber == 3) ^ (firstNumber <= 5)));
    System.out.println("!(4==3): " + !(firstNumber == 3));
  }

  private static void checkIfTwoObjectsAreEqual() {
    Student student1 = new Student("John", "Doe", 194, 200);
    System.out.println("Student: " + student1.print());

    Student student2 = new Student("John", "Smith", 195, 200);
    System.out.println("Student: " + student2.print());

    // comparing above created Objects.
    if(student1.hashCode() == student2.hashCode()) {
      if(student1.equals(student2))
        System.out.println("Both Objects are equal. ");
      else
        System.out.println("Both Objects are not equal. ");
    }
    else
      System.out.println("Both Objects are not equal. ");
  }
}
