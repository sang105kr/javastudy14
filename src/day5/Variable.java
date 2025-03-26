package day5;

public class Variable {
  public static void main(String[] args) {
    int x, y, z;  // 변수 선언
    x = 10;
    y = 20;
    z = 30;
    System.out.printf("x = %d\ty = %d\tz = %d",x, y, z);

    System.out.println(); // 줄바꿈
    
    int i=10, j=20, k=30;  // 변수선언 + 초기화
    System.out.printf("i = %d\tj = %d\tk = %d",i, j, k);
  }

  public static void method1() {
    int x, y, z;  // 변수 선언
    x = 10;
    y = 20;
    z = 30;
    System.out.printf("x = %d\ty = %d\tz = %d",x, y, z);
  }
}
