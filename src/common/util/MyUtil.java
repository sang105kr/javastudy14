package common.util;

public class MyUtil {
  public static int cnt; // 동일타입의 객체들끼리 공유하는 변수
  public int cnt2;       // 동일타입의 객체가 각자 다른 값을 갖는 변수

  public void printLine(char ch, int cnt) {
    for (int i = 0; i < cnt; i++) {
      System.out.print(ch);
    }
    System.out.println();
  }

  public static void printLine2(char ch, int cnt) {
    for (int i = 0; i < cnt; i++) {
      System.out.print(ch);
    }
    System.out.println();
  }
}
