package day9.access.pack2;

import day9.access.pack1.A;

public class C {
  public void print(){
    A a = new A();
    System.out.println(a.a + " ");
//    System.out.println(a.b + " "); // 상속관계가 아니므로 접근불가
//    System.out.println(a.c + " "); // 다른 패키지 이므로 접근불가
//    System.out.println(a.d + " "); // 다른 클래스 이므로 접근불가
  }
}
