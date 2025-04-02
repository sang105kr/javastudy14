package day10.question.q7;
// 문제 7: Employee.java
// 직원을 모델한다
public class Employee {
  public String name;      // 이름
  public String number;    // 주민등록번호
  public String position;    // 직위
  public double hourlyWages;  // 시간당 임금

  // 임금을 계산한다
  public double getPay(double hours) {
    double wage;
    if (hours <= 40) {
      wage = hours * hourlyWages;
    } else {
      wage = 40 * hourlyWages + (hours - 40) * 1.5 * hourlyWages;
    }

    return wage;
  }

  // 시간당 임금을 증감한다
  public void raise(double amount) {
    if (amount < 0) {
      amount = -amount;
    }
    if (hourlyWages <= amount) {
      System.out.println("증감액만큼 증액 또는 감액할 수 없다");
    } else {
      hourlyWages += amount;
    }
  }
}
