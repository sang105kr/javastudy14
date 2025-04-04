package day11.exam5;

public class Parent {
  int parentField1 = 1;
  private int parentField2;
  static int parentField3;

  void parentMethod1(){
    System.out.println("parentMethod1() 호출됨!");
  }

  private void parentMethod2(){
    System.out.println("parentMethod2() 호출됨!");
  }

  static void parentMethod3(){
    System.out.println("parentMethod3() 호출됨!");
  }
}
