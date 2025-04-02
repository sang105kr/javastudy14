package day10.question.q3;
// 문제 3: Circle.java
// 원을 모델한다
public class Circle {
  public double radius;  // 반지름

  // 원의 반지름을 반환한다
  public double getRadius() {
    return radius;
  }

  // 원의 면적을 계산한다
  public double computeArea() {
    return 3.14 * radius * radius;
  }

  // 원의 둘레를 계산한다
  public double computePerimeter() {
    return 2.0 * 3.14 * radius;
  }

  // 원의 반지름을 주어진 값으로 변경한다
  public void setRadius(double newRadius) {
    radius = newRadius;
  }
}
