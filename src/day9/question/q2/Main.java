package day9.question.q2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    SumOfSquares sumOfSquares = new SumOfSquares();
    int N;
    Scanner scanner = new Scanner(System.in);
    System.out.printf("양의 정수 : ");
    N = scanner.nextInt();

    System.out.println(sumOfSquares.sumWhile(N));
    System.out.println(sumOfSquares.sumRecursive(N));

  }
}
