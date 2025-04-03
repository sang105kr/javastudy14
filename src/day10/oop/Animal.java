package day10.oop;
/*
    다형성 전제조건
    1. 상속관계 or 구현관계
    2. 하위개념에서 상위개념의 메소드를 재정의 해야한다.
    3. 하위객체가 상위개념에 대입되어야한다.
 */
public class Animal {
  void makeSound(){
    System.out.println("소리내다");
  }
}
