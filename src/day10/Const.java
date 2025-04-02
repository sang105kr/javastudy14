package day10;
/*
  상수 변수: 초기화 이후 값을 재할당이 불가능한 변수
 */
public class Const {
  public static void main(String[] args) {
    int x;    //변수 선언
    x = 10;   //변수 초기화
    x = 20;   //변수 재할당

    final int Y;   //상수 선언
    Y = 10;        //상수 초기화
//    Y = 20;        //상수 재할당(X)
    
  }
}
