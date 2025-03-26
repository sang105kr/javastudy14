package day5;

public class VariableInitialization {
  public static void main(String[] args) {
    int x ;   // 변수 선언
    //System.out.println(x); 변수를 초기화하지 않은 상태에서는 접근 불가
  }
  public static void method(){
    // 변수 초기화할때 기본값으로 아래와 같이 작성할수 있다.
    int x = 0;
    double y = 0;
    boolean z = false;
    String str = "";
    String str2 = null; // null : 참조 타입에서만 값으로 사용 가능 (값이 없음을 뜻함)
    char ch = ' ';
  }
}
