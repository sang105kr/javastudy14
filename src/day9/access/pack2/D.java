package day9.access.pack2;

import day9.access.pack1.A;

public class D extends A {
  public void print(){
    System.out.println(a + " ");
    System.out.println(b + " ");   // 다른 패키지라 하더라도 상속관계에 있으므로 접근가능
//    System.out.println(c + " "); 다른 패키지 이므로 접근 불가!
//    System.out.println(d + " "); 다른 클래스 이므로 접근 불가!
  }
}
