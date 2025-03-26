package day5;

import java.util.Random;
/*
  로또 생성기(1~45)중 6개 번호를 배열에 저장 후 출력(단, 중복없어야함)
  배열을 사용할 것.
 */
public class Question_2 {
  public static void main(String[] args) {
    Random random = new Random();
    int[] lotto = new int[6];

    //로또 번호 생성
    for (int i = 0; i < lotto.length; i++) {
      lotto[i] = random.nextInt(45) + 1;

      //이전 생성된 번호와 중복체크
      for (int j = 0; j < i; j++) {
        if(lotto[i] == lotto[j]) {
          i--;
          break;
        }
      }
    }

    //로또 번호 생성 후 출력
    for (int i = 0; i < lotto.length; i++) {
      System.out.printf("%3d",lotto[i]);
    }
  }
}
