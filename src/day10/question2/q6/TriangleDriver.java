package day10.question2.q6;

public class TriangleDriver {
  public static void main(String[] args) {
    Triangle triangle1 = null;
    Triangle triangle2 = null;
    Triangle triangle3 = null;

//    1. triangle1 = 세 변의 길이가 각각 3, 5, 7 인 Triangle 객체
//    2. triangle2 = 세 변의 길이가 각각 3, 4, 5 인 Triangle 객체
//    3. triangle3 = 세 변의 길이가 각각 7, 10, 7
    triangle1 = new Triangle(3, 5, 7);
    triangle2 = new Triangle(3, 4, 5);
    triangle3 = new Triangle(7, 10, 7);

    if(triangle1.is_right()){
      System.out.println("직각 삼각형 이다.");
    } else if (triangle1.is_isoscles()) {
      System.out.println("이등변 삼각형 이다.");
    }else{
      System.out.println("직각 삼각형도 이등변 삼각형도 아니다");
    }

    if(triangle2.is_right()){
      System.out.println("직각 삼각형 이다.");
    } else if (triangle2.is_isoscles()) {
      System.out.println("이등변 삼각형 이다.");
    }else{
      System.out.println("직각 삼각형도 이등변 삼각형도 아니다");
    }

    if(triangle3.is_right()){
      System.out.println("직각 삼각형 이다.");
    } else if (triangle3.is_isoscles()) {
      System.out.println("이등변 삼각형 이다.");
    }else {
      System.out.println("직각 삼각형도 이등변 삼각형도 아니다");
    }

  }
}
