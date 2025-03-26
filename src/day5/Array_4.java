package day5;

public class Array_4 {
  public static void main(String[] args) {
    // 배열의 선언 + 생성 + 초기화를 한줄에 작성 가능
    // case1)
    int[] numbers = new int[]{10, 20, 30, 40, 50};
    System.out.println(numbers.length); // 배열의 크기

    //배열 요소의 초기값 확인
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }

    //case2) new int[] 생략가능 (단, 한줄에 작성시)
    int[] number2 = {10, 20, 30, 40, 50};

    //case3) new int[] 생략불가 (배열 선언과 배열생성 초기화를 분리시)
    int[] number3;
//    number3 = {10, 20, 30, 40, 50};

  }
}
