package day13.annonymous2;

public class Main {
  public static void main(String[] args) {
    AbstractFly abstractFly = new Fly();
    AbstractFly abstractFly2 = new Fly();
    abstractFly.fly();
    abstractFly2.fly();

    System.out.println("==");
    
    //이름 없는 클래스 : 익명클래스
    AbstractFly abstractFly3 = new AbstractFly() {
      @Override
      void fly() {
        System.out.println("날다");
      }
    };

    AbstractFly abstractFly4 = new AbstractFly() {
      @Override
      void fly() {
        System.out.println("날다");
      }
    };
    abstractFly3.fly();
    abstractFly4.fly();

    new AbstractFly() {
      @Override
      void fly() {
        System.out.println("날다");
      }
    }.fly();
  }
}
