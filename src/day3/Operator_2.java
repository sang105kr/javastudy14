package day3;
/*
  논리연산자(4) : && , ||, !, ^
 */
public class Operator_2 {
  public static void main(String[] args) {
    boolean result = 10 > 5;
    System.out.println("result = " + result);

    System.out.println( 10 > 5);  // true
    System.out.println( 10 < 5);  // false

    System.out.println("=============");
    // && (그리고) : 피연산자가 모두 true일때 true, 나머지의 경우는 false
    System.out.println( true && true);  // true
    System.out.println( true && false);
    System.out.println( false && true);
    System.out.println( false && false);
    System.out.println("=============");
    // || (또는) : 피연산자가 하나라도 true일때 true, 나머지의 경우는 false
    System.out.println( true || true);  // true
    System.out.println( true || false); // true
    System.out.println( false || true); // true
    System.out.println( false || false);
    System.out.println("=============");
    // ! (부정) : 피연산자가 false일때 true
    System.out.println(!true);
    System.out.println(!false  ); // true
    System.out.println(!!true);  // 부정의 부정은 자신
    System.out.println("=============");
    // ^ (배타적논리합) : 피연산자가 서로 다를때 true, 나머지의 경우 false
    System.out.println( true  ^ true);
    System.out.println( true  ^ false); // true
    System.out.println( false ^ true);  // true
    System.out.println( false ^ false);
  }
}
