package day10.question.q1;

public class Main {
  public static void main(String[] args) {
    Person person = new Person("홍","길동");

    String firstName = person.getFirstName();
    System.out.println("firstName = " + firstName);

    System.out.println(person.getLastName());
    System.out.println(person.getLength());

    Person person2 = new Person("홍", "길서");
    Person person3 = new Person("홍", "길남");

    System.out.println(person2.getLength());
    System.out.println(person3.getLength());

  }
}
