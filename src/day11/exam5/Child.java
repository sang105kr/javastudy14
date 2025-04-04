package day11.exam5;

public class Child extends Parent{
  int parentField1 = 2;

  @Override
  void parentMethod1() {
//    super.parentMethod1();
    System.out.println("부모기능에 더해서 추가");
  }
}
