package day5;

public class VariableScope {
  public static void main(String[] args) {
    int x = 10;
    {
      int y = 20;
      System.out.println(x); // 상위 블럭에서 선언한 변수는 하위 블럭에서 접근 가능

//      double y = 30;  동일한 블럭내에 동일한 이름의 변수 선언 불가
//      int x = 30; 상위 블럭에 선언된 변수는 하위 블럭에서 동일한 이름 사용 불가
    }
//    System.out.println(y); 하위 블럭에서 선언한 변수 상위 블럭에서 접근 불가
  }
}
