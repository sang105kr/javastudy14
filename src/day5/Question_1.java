package day5;

import java.util.Scanner;

/*
  국,영,수 점수를 입력받아서 총점과 평균을 구하는 프로그램을 구현하시오.
  국어 : 90
  영어 : 80
  수학 : 70
  총점 : 240
  평균 : 80.0
 */
public class Question_1 {
  public static void main(String[] args) {
    int kor = 0, eng = 0, math = 0; // 국,영,수
    int sum = 0;      //합계
    double avg = 0.0; //평균

    Scanner scanner = new Scanner(System.in);
    System.out.print("국어 : ");
    kor = scanner.nextInt();
    System.out.print("영어 : ");
    eng = scanner.nextInt();
    System.out.print("수학 : ");
    math = scanner.nextInt();

    sum = kor + eng + math;
    avg = (double)sum / 3;

    System.out.println("총점 : " + sum);
    System.out.println("평균 : " + avg);

  }
}
