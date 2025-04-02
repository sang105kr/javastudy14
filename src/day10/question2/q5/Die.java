package day10.question2.q5;

import java.util.Random;

public class Die {
  private int faceValue; // 주사위의 현재 면

  public Die() {
    roll();
  }

  // 주사위를 던진 후 나온 값을 반환한다
  public int roll() {
    Random random = new Random();
    faceValue = random.nextInt(6) + 1;
    return faceValue;
  }

  // 주사위의 현재 면을 반환한다
  public int getFaceValue() {
    return faceValue;
  }
}
