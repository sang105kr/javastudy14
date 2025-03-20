package day1;

public class Test4 {
  public static void main(String[] args) {
    // 변수 : 메모리 공간에 하나의 값을 저장하기위해 붙인 이름
    // 타입 : 값의 종류와 메모리 크기를 한정
    int kor;    // 정수형 변수 선언
    kor = 90;   // 변수 선언후 처음 할당하는 행위를 변수 초기화
    System.out.println(kor);
    kor = 95;   // 변수 초기화 후 할당하는 행위를 재할당
    System.out.println(kor);
    
    int eng = 80;  // 정수형 변수 선언 + 초기화
    // 문자열 연결 연산자(+) : 피연산자중 하나라도 문자열이 오면 피연산자를 문자열형으로 변환후 연결
    System.out.println("eng=" + eng);

    int math = 70;
    System.out.println("math=" + math);

    int sum = kor + eng + math;
    System.out.println("sum=" + sum);

    int avg = sum / 3;
    System.out.println("avg=" + avg);

    double avg2 = (double)sum / 3;
    System.out.println("avg2=" + avg2);

    double avg3 = avg2;
    System.out.println("avg3=" + avg3);

    System.out.println(sum(10,20));
    System.out.println(sum(20,30));

    int value = sum(30,40);
    System.out.println("value = " + value);

    int value2 = sum(30,40) + sum(50,60);
    System.out.println("value2 = " + value2);

    int value3 = sum(70,80) + kor + eng + math;
    System.out.println("value3 = " + value3);
  }

  public static int sum(int value1, int value2) {
    return value1 + value2;
  }
}
