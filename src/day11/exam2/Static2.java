package day11.exam2;
/*
  1.인스턴스 멤버(인스턴스 필드,인스턴스 메소드) : 인스턴스(객체)를 생성해야 사용가능
  2.정적 멤버(정적 필드,정적 메소드) : 인스턴스 생성없이 클래스명.멤버명으로 사용가능
  3.정적 필드 = static 필드 = 클래스 필드
  4.static필드의 용도 : 동일타입의 객체들끼리 공유해야할 속성이 있을때 사용
  5.static메소드 용도 : 메인 메소드 실행전 static 필드에 접근하고자 할때 사용
 */
public class Static2 {
  // 인스턴스 필드
  int field1;
  // 정적 필드
  static int field2;

  // 인스턴스 메소드
  void method1(){
    System.out.println("method1() 호출됨!");
    System.out.println(field1);
    System.out.println(field2);
  }
  
  // 정적 메소드
  static void method2(){
    System.out.println("method2() 호출됨!");
  // 정적 멤버는 main 메소드 호출전에 이미 메모리에 로딩되어 있는 상태로 이시점에서
  // main메소드 호출후 인스턴스를 생성해야 만들어지는 인스턴스 필드는 접근 불가.
  // System.out.println(field1);
    System.out.println(field2);
  }
}
