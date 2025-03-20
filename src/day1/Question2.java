package day1;

import java.util.Scanner;

/*
문) 점수를 입력받아서 학점을 출력하는 프로그램을 구현하시오
    90이상은 A학점, 80이상은 B학점, 70이상은 C학점, 60이상은 D학점, 60미만은 F학점
 */
public class Question2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("점수를 입력하세요 : ");
    int score = scanner.nextInt();
    if (score >= 90) {
      System.out.println("A학점");
    } else if (score >= 80) {
      System.out.println("B학점");
    } else if (score >= 70) {
      System.out.println("C학점");
    } else if (score >= 60) {
      System.out.println("D학점");
    }else{
      System.out.println("F학점");
    }
  }

}
