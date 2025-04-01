package day9.access.pack1;

public class B {
  public void print(){
    A a = new A();

    System.out.println(a.a + " ");
    System.out.println(a.b + " ");
    System.out.println(a.c + " ");
//    System.out.println(a.d + " "); // 다른 클래스 이므로 접근불가
  }
}
