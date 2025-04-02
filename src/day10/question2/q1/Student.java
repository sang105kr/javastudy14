package day10.question2.q1;

public class Student {
  private int studentnumber;    // 학번
  private String name;          // 이름
  private int testscore1;       // 시험점수 1
  private int testscore2;       // 시험점수 2
  private int testscore3;       // 시험점수 3

  public Student(int studentnumber, String name, int testscore1, int testscore2, int testscore3) {
    this.studentnumber = studentnumber;
    this.name = name;
    this.testscore1 = testscore1;
    this.testscore2 = testscore2;
    this.testscore3 = testscore3;
  }

  void setScore(int num, int score){
    switch(num){
      case 1:
        testscore1 = score;
        break;
      case 2:
        testscore2 = score;
        break;
      case 3:
        testscore3 = score;
        break;
      default:
        System.out.println("시험 번호는 1부터 3사이의 정수여야 한다.");
    }
  }

  int getScore(int num) {
    int score = -1;
    switch (num) {
      case 1:
        score = testscore1;
        break;
      case 2:
        score =  testscore2;
        break;
      case 3:
        score =  testscore3;
        break;
    }
    return score;
  }
}
