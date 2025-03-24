package day3;
/*
  3항연산자  : if ~ else 문의 단축표현
  (조건식) ? 표현식1 : 표현식2;
 */
public class Operator_4 {
  public static void main(String[] args) {
    int number = 9;
    if (number % 2 == 0) {
      System.out.println("짝수");
    }else{
      System.out.println("홀수");
    }

    System.out.println((number % 2 == 0) ? "짝수"  : "홀수");

    String result = (number % 2 == 0) ? "짝수"  : "홀수";
    System.out.println("result = " + result);
  }
}
