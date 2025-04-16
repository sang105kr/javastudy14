package day14.exam3;

public interface B {
  int MAX = 200; // public static final생략됨

  void methodC(); // public abstract생략됨
  default void methodA(){
    System.out.println("interface B");
  }
}
