package day11.exam3;
/*
  static field : 동일 타입의 객체가 공유하는 변수
 */
public class Car {
  static int serial;

  public Car() {
    serial++;
  }

}
