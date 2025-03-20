package day1;

import java.util.Scanner;

/*
  문제) 정수를 입력받고 입력받은 값이 홀수인지 짝수인지를 판단하는 프로그램 구현하기
*/
public class Question1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while(true) {
      System.out.println(">> 정수를 입력하면 홀수인지 짝수인지 판단하는 프로그램 <<");
      System.out.print("정수를 입력하세요 : ");
      int number = scanner.nextInt();

      if (number % 2 == 0) {
        System.out.println("짝수입니다");
      } else {
        System.out.println("홀수입니다.");
      }
    }
  }
}
