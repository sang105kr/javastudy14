package day1;

public class Test2 {

  public static void method1() {
    System.out.println("method1");
    method2();

  }
  public static void main(String[] args) {
    System.out.println("hi");
    System.out.println("hi2");
    System.out.println("hi3");
    method2();
    method1();
  }

  public static void method2(){
    System.out.println("method2");
  }
}
