package day5;

public class Array_2 {
  public static void main(String[] args) {
    double[] array;           // 배열 선언
    array = new double[3];    // 배열 생성
    
    // 배열 요소의 초기값 확인
    for (int i = 0; i < array.length; i++) {
      System.out.println( array[i]);
    }
    
    // 배열 요소 재할당
    array[0] = 10;
    array[1] = 20;
    array[2] = 30;

    // 배열 요소의 현재값 확인
    for (int i = 0; i < array.length; i++) {
      System.out.println( array[i]);
    }
    
  }
}
