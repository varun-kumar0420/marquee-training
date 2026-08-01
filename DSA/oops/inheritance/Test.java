import java.util.*;

class Vehicle {
  Vehicle() {
    System.out.println("vechile is started");
  }
}

class Car extends Vehicle {
  Car() {
    System.out.println("This Vehicle is Car");
  }
}

public class Test {
  public static void main(String[] args) {
    Car obj = new Car();
  }
}