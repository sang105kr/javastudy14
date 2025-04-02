package day10.question.q3;

public class CircleDriver {
  public static void main(String[] args) {
    Circle cir;  // Circle 객체 참조변수
    double area;  // 면적
    double perm;  // 둘레

    // (1) Circle 객체를 만들어 cir가 가리키게 한다
    cir = new Circle();

    // (2) cir의 반지름을 5.0으로 변경한다
    cir.setRadius(5.0);

    // (3) cir의 면적을 구하여 area에 저장한다
    area = cir.computeArea();

    // (4) cir의 둘레를 구하여 perm에 저장한다
    perm = cir.computePerimeter();

    // (5) 원의 면적과 둘레를 출력한다
    System.out.println("원의 면적: " + area);
    System.out.println("원의 둘레: " + perm);
  }
}
