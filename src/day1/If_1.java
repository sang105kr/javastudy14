package day1;

public class If_1 {
  public static void main(String[] args) {
    // 산술연산자 : 덧셈(+), 뺄셈(-) , 곱하기(*) , 나누기 (/), 나머지(%)
    // 비교연산자 : 크다(>), 작다(<), 이상(>=), 이하(<=), 같다(==), 같지않다(!=)
//    System.out.println( 10 > 3);
//    System.out.println( 10 == 3);
//    System.out.println( 6 % 2 );

    int x = 10;  //정수형 변수
    double pi = 3.1414; //실수형 변수
    String name = "홍길동"; //문자열형 변수
    char ch = '홍'; // 문자형 변수
    boolean flag = true;  // 논리형 변수 ( true or false) 2가지 값만 가짐)

    //단순 if문
    if( x % 2 == 0 ){
      System.out.println("참");
    }

    // if ~ else문
    if( 10 % 3 == 0 ){
      System.out.println("짝수");
    }else{
      System.out.println("홀수");
    }

    // 다중 if문
    int score = 50;
    if(score >= 90) {
      System.out.println("A");
    } else if (score >= 80) {
      System.out.println("B");
    } else if (score >= 70) {
      System.out.println("C");
    } else if (score >= 60) {
      System.out.println("D");
    } else {
      System.out.println("F");
    }
  }
}
