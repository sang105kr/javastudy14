package day10.question2.q5;

public class DieDriver {
  public static void main(String[] args) {
    int i = 0;                      // 반복문 제어 변수
    int face1 = -1, face2 = -1;     // 주사위의 값
    int sum = 0;                    //주사위 숫자의 합
    int count = 0;                  // 2개 주사위 합이 7 or 11이 나온 횟수
    Die d1 = null, d2 = null;       // Die 객체 변수

    count = 0;
    d1 = new Die();
    d2 = new Die();
    while (i < 100) {
      face1 = d1.roll();
      face2 = d2.roll();
      sum = face1 + face2;
      if (sum == 7 || sum == 11) {
        System.out.printf("die1:%d, die2:%d, sum:%d \n",face1,face2,sum);
        count++;
      }
      i++;
    }
    System.out.println("count = " + count);
  }
}
