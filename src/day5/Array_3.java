package day5;

public class Array_3 {
  public static void main(String[] args) {
    char[] flag;         // 배열 선언
    flag = new char[3];  // 배열 생성

    for (int i = 0; i < flag.length; i++) {
      System.out.println(flag[i]); // /u0000(null문자) 로 초기화
    }


    String[] names;         // 배열 선언
    names = new String[3];  // 배열 생성

    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]); // 참조타입은 null 로 초기화
    }
  }
}
