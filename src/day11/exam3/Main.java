package day11.exam3;
/*
  Car객체를 생성하고 생성할때마다 일련번호를 부여하는 코드를 구현하시오.
  (단,Car객체는 일련변호를 멤버로 가지고 있어야한다.)
  car1 : 1
  car2 : 2
  car3 : 3
 */
public class Main {
  public static void main(String[] args) {
    Car car1 = new Car();
    System.out.println(car1.serial);
    Car car2 = new Car();
    System.out.println(car2.serial);
    Car car3 = new Car();
    System.out.println(car3.serial);

    System.out.println(Car.serial);
  }
}
