package day3;

import java.util.Random;

/*
  랜텀한 정수 발생
 */
public class Test1 {
  public static void main(String[] args) {
    Random random = new Random();
    for (int i = 0; i < 6; i++) {
      int number = random.nextInt(45) + 1; // 0 <= x < 45
      System.out.printf("%d \t", number);
    }
  }
}
