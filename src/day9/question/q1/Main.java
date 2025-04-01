package day9.question.q1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int a, b;           // 자연수
    int prod1, prod2, prod3;  // 메소드 호출후 반환받는 변수
    Scanner scanner;          // 콘솔 입력을위한 변수 선언

    scanner = new Scanner(System.in);

    System.out.printf("첫번째 자연수 : ");
    a = scanner.nextInt();
    System.out.printf("두번째 자연수 : ");
    b = scanner.nextInt();

    CalculateProduct cal = new CalculateProduct();
    prod1 = cal.product1(a, b);
    prod2 = cal.product2(a, b);
    prod3 = cal.product3(a, b);

    System.out.printf("%d %d %d", prod1, prod2, prod3);
    System.out.println();

  }
}
