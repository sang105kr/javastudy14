package day10.question.q5;
// 문제 5: Rectangle.java
// 직사각형을 모델한다

public class Rectangle {
  public double length;  // 가로
  public double width;  // 세로

  // 직사각형의 면적을 계산한다
  public double calculateArea() {
    return length * width;
  }

  // 직사각형의 둘레를 계산한다
  public double calculatePerimeter() {
    return (length + width) * 2.0;
  }

  // 직사각형의 가로의 길이를 반환한다
  public double getLength() {
    return length;
  }

  // 직사각형의 세로의 길이를 반환한다
  public double getWidth() {
    return width;
  }

  // 직사각형의 가로의 길이를 주어진 값으로 변경한다
  public void setLength(double NewLength) {
    if (NewLength > 0 && NewLength < 20) length = NewLength;
    else System.out.println("가로 길이가 범위를 벗어 난다!");
  }

  // 직사각형의 세로의 길이를 주어진 값으로 변경한다
  public void setWidth(double NewWidth) {
    if (NewWidth > 0 && NewWidth < 20) width = NewWidth;
    else System.out.println("세로 길이가 범위를 벗어 난다!");
  }
}
