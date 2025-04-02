package day10.question2.q6;

public class Triangle {
  private int side1;  //삼각형의 첫 번째 변의 길이
  private int side2;  //삼각형의 두 번째 변의 길이
  private int side3;  //삼각형의 세 번째 변의 길이

  public Triangle(int side1, int side2, int side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  //삼각형이 직각삼각형인지를 알려 준다
  boolean is_right(){
    boolean flag = false;
    if( (side1 * side1) + (side2 * side2) == (side3 * side3) ||
        (side2 * side2) + (side3 * side3) == (side1 * side1) ||
        (side3 * side3) + (side1 * side1) == (side2 * side2) ) {
      flag = true;
    }
    return flag;
  }

  // 삼각형이 이등변삼각형인지를 알려 준다
  boolean is_isoscles(){
    boolean flag = false;
    if( side1 == side2 || side2 == side3 || side3 == side1){
      flag = true;
    }
    return flag;
  }
}
