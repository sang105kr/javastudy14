package day9.exam1;

public class Main {
  public static void main(String[] args) {
    Person person = new Person("홍길동");
    person.smile();
    person.eat();
    System.out.println(person.getAge());
    System.out.println(person.getName());
    System.out.println(person);
    person.setNickname("별칭");
    System.out.println(person.getNickname());

    person.setAge(10);
    System.out.println(person.getAge());
//    person.age = 20;
//    person.name = "홍길순";

//    System.out.println(person.age);
//    System.out.println(person.name);

//    Person person2 = new Person("홍길동");
//    person2.smile();
//    person2.eat();
//    System.out.println(person2.age);
//    System.out.println(person2.name);
//    System.out.println(person2);
//
//    Person person3 = new Person("홍길서",30);
//    person3.smile();
//    person3.eat();
//    System.out.println(person3.age);
//    System.out.println(person3.name);
//    System.out.println(person3);
  }
}
