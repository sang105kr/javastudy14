package day13.annonymous1;

public class Main {
  public static void main(String[] args) {
    Bird bird = new Bird();
    Bird bird2 = new Bird();
    bird.fly();
    bird2.fly();

    System.out.println("==");

    //익명 클래스
    Flyable fly = new Flyable(){
      @Override
      public void fly() {
        System.out.println("새가 날다");
      }
    };

    Flyable fly2 = new Flyable(){
      @Override
      public void fly() {
        System.out.println("새가 날다");
      }
    };
    fly.fly();
    fly2.fly();
  }
}
