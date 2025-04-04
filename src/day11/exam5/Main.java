package day11.exam5;

import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    Parent parent = new Parent();
    System.out.println(parent.parentField1);
    parent.parentMethod1();

    System.out.println("========");

    Child child = new Child();
    System.out.println(child.parentField1);
    child.parentMethod1();

    Parent parent2 = child;
    // 메소드 재정의(O)
    parent2.parentMethod1();
    // 필드는 재정의(X)
    System.out.println(parent2.parentField1);
  }
}
