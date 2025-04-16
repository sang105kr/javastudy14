package day14.exam2;

public class Main {
  public static void main(String[] args) {
    int x = 10;
    double y = x;

    int z = (int)y;

    Person person = new HighStudent();
    person.eat();
    person.smile();
    person.walk();

    Student student = (Student) person;
    student.eat();
    student.smile();
    student.study();

    HighStudent highStudent =  (HighStudent) student;
    highStudent.eat();
    highStudent.smile();
    highStudent.study();
    highStudent.takeTheEntranceExam();

    student  =  highStudent;
    student.study();

    Walkable walkablePerson =  person;
    walkablePerson.walk();

    System.out.println(person instanceof Walkable);
    System.out.println(person instanceof Person);
    System.out.println(person instanceof Student);
    System.out.println(person instanceof HighStudent);
    System.out.println(person instanceof Object);

    System.out.println("==");
    Walkable walkableStudent = new Student();
    System.out.println(walkableStudent instanceof Walkable);
    System.out.println(walkableStudent instanceof Person);
    System.out.println(walkableStudent instanceof Student);
    System.out.println(walkableStudent instanceof HighStudent);
    System.out.println(walkableStudent instanceof Object);

    method(person);   // 실체 : HightStudent
    method(walkableStudent);  // 실체 : Student
  }

  private static void method(Walkable walkable) {
    walkable.walk();

    // 객체의 타입이 특정 타입인지를 체크하는 연산자
    if(walkable instanceof HighStudent){
      HighStudent highStudent = (HighStudent) walkable;
      highStudent.takeTheEntranceExam();
    }
  }
}
