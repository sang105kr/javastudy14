package day3;
/*
    대입연산자(6) : = , += , -=, *=, /= , %=
 */
public class Operator_1 {
  public static void main(String[] args) {
    int var;   // 정수형 변수 선언
    var = 10;  // 변수 초기화 
    var = 20;  // 재할당
    System.out.println("var = " + var); // 20

    var = var + 1;  // 1증가
    System.out.println("var = " + var); // 21

    // 대입연산자 : = , += , -=, *=, /= , %=
    var += 1;   // var = var + 1 와 동일
    System.out.println("var = " + var);  //22

    var %= 2; // var = var % 2 와 동일
    System.out.println("var = " + var);  //0

    var -= 10;  // var = var - 10 와 동일
    System.out.println("var = " + var); // -10
    
    var *= -2;  // var = var * -2 와 동일
    System.out.println("var = " + var); // 20
    
    var /= 2;   // var = var / 2 와 동일
    System.out.println("var = " + var); // 10
  }
}
