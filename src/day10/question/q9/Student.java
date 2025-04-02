package day10.question.q9;

public class Student {
  private String name;         // 이름
  private int number;         // 학번
  private String department;  // 소속학과

  // getter, setter
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  // String.toString() : 객체의 상태를 문자열로 표현하는 용도의 메소드
  @Override
  public String toString() {
    return name + " , " + number + " , " + department;
  }
}
