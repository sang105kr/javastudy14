package day14.exam3;

public interface A{
  int MAX = 100; // public static final생략됨

  void methodC(); // public abstract생략됨
  default void methodA(){
    System.out.println("interface A");
  }
  static void staticMethodA(){
  }
}
