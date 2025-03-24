package day3;

import java.util.Scanner;

/*
 문) 사용자로 부터 3개의 정수값을 입력 받아 최대값을 출력하는 프로그램을 구현하시오
 */
public class Question_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.printf("정수1 : ");
    int num1 =scanner.nextInt();
    System.out.printf("정수2 : ");
    int num2 =scanner.nextInt();
    System.out.printf("정수3 : ");
    int num3 =scanner.nextInt();

    // 최대값 구하기
    int max = num1;   // num1을 최대값으로 가정
    if(max < num2) {  // num2랑 비교해서 num2가 크면 num2를 최대값으로 수정
      max = num2;
    }
    if(max < num3) {  // num3랑 비교해서 num3가 크면 num3를 최대값으로 수정
      max = num3;
    }
    System.out.println("max = " + max);
    
    // 최소값 구하기
    int min = num1;
    if(min > num2) {
      min = num2;
    }
    if(min > num3) {
      min = num3;
    }
    System.out.println("min = " + min);
  }
}
