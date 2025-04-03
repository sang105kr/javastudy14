package day11.exam4;

// java.lang패키지에 놓은 클래스는 자주 사용되므로
// 개발자가 명시적으로 작성하지 않더라도 컴파일러가 자동 추가해 준다.
import java.lang.*;

public class Person extends Object{
  String name;
  int age;

  Person(){
    super();
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}
