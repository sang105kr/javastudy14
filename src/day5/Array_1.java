package day5;

import java.util.Random;

public class Array_1 {
  public static void main(String[] args) {
    int[] subjects = new int[10];
    System.out.println(subjects.length);  //배열의 크기
    Random random = new Random();

    for (int i = 0; i < subjects.length; i++) {
      subjects[i] = random.nextInt(100) + 1;
      System.out.println("subjects[" + i + "] = " + subjects[i]);
    }

//    subjects[3] = 60; // 배열의 크기를 초과할수 없다.

    int sum = 0;
    for (int i = 0; i < subjects.length; i++) {
      sum += subjects[i];  // sum = sum + subjects[i]
    }

    double avg = (double)sum / subjects.length;

    System.out.println("총점 : " + sum);
    System.out.println("평균 : " + avg);
  }
}
