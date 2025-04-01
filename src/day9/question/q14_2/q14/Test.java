package day9.question.q14_2.q14;

public class Test {
  public static void main(String[] args) {
    String password = "a1B2c3";


    char ch = password.charAt(0);
    if ( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ){
      System.out.println("알파벳이다");
    }else {
      System.out.println("알파벳이 아니다.");
    }

    char ch2 = password.charAt(1);
    if ( ch2 >= '0' && ch2 <= '9'){
      System.out.println("숫자다");
    }else{
      System.out.println("숫자가 아니다");
    }

  }
}
