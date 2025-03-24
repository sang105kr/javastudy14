package day3;
/*
  증감 연산자 : ++, --
  전위 증감연산자 : ++var,  --var
  후위 증감연산자 : var++,  var++

  증감연산자가 단독으로 사용될때: 피연산자를 1증가 or 1감소
  증감연산자가 식에 참여해서 사용될때:
    전위 - 피연산자를 1증가 or 1감소 후 식에 참여
    후위 - 식에 참여 후 피연산자를 1증가 or 1감소
 */
public class Operator_3 {
  public static void main(String[] args) {
    int var = 10;
    
    var++;  // var = var + 1;  var += 1; 와 동일
    System.out.println("var = " + var); // 11
    
    ++var;  // var = var + 1;  var += 1; 와 동일
    System.out.println("var = " + var); // 12
    
    int result = 0;

    result = ++var;
    System.out.printf("result = %d, var = %d\n", result, var); // 13,13

    result = var++;
    System.out.printf("result = %d, var = %d\n", result, var); // 13,14

    result = ++var + 10;
    System.out.printf("result = %d, var = %d\n", result, var); // 25,15

    result = var++ + 10;
    System.out.printf("result = %d, var = %d\n", result, var); // 25,16

    int sum = 0;
    for (int i = 1; i <= 10 ; i++) {
      sum += i;  // sum = sum + i
    }
    System.out.println("sum = " + sum);
    System.out.printf("sum = %d \n", sum);

    System.out.printf("double = %.3f ,\t name = %s \n", 3.14, "홍길동" );
  }
}
