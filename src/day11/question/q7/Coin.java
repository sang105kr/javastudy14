package day11.question.q7;

import java.util.Random;

public class Coin {
  final private int HEADS = 1;// 앞면을 나타내는 상수
  final private int TAILS = 2;  // 뒷면을 나타내는 상수
  private int face;             // 동전의 현재 면

  public Coin() {
    super();
    flip();
  }

  public void flip() {
    Random random = new Random();
    face = random.nextInt(2) + 1;
  }

  public int getFace() {
    return face;
  }

  @Override
  public String toString() {
    if(face == HEADS) {
      return "앞면";
    } else {
      return "뒷면";
    }
  }
}
