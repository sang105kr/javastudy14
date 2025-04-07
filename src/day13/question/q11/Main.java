package day13.question.q11;

import day12.exam5.A;

public class Main {
  public static void main(String[] args) {
    Vehicle[] vehicles = new Vehicle[2];
    
    vehicles[0] = new Sedan("현대","제네시스");
    vehicles[1] = new Sedan("기아","모하비");

    for (Vehicle vehicle : vehicles) {
      vehicle.start();
      vehicle.stop();
    }

    //static 멤버 출력
    System.out.println("Max speed of vehicles : " + Vehicle.MAX_SPEED);
    System.out.println("Number of wheels in a car : " + AbstractCar.NUMBER_OF_WHEELS);
  }
}
