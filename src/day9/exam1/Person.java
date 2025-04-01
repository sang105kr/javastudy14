package day9.exam1;
/*
  가상세계에 가상객체를 만드는 방법
  현실/상상 세계의 대상(객체) -> 추상화 -> 클래스(개념정의) -> 인스턴스화 -> 인스턴스(가상객체)
  
  클래스(class) : 객념(명사,동사) 설계 도구
  객체(Object) : 실세계의 객체, 가상세계의 객체
  인스턴스(instance) : 가상세계의 객체 하나하나를 가리킬때
  
  생성자(constructor)메소드 : 인스턴스를 생성하고, 인스턴스의 초기값을 설정하는 역할
  생성자 오버로딩(overloading) : 동일한 이름으로 매개변수의 갯수,타입을 달리하여 여러개 정의 할수있는 문법

  this : class에 정의된 개념을 기반으로 생성될 객체
  this() : 생성될 객체의 생성자 호출

  멤버(member) : 클래스 내에 정의된 필드,메소드
 */
public class Person extends Object {
  // 필드(field) : 속성정의
  private String name;
  private int age;
  private String nickname;

  // 생성자(constructor)
  // 디폴트 생성자
  Person(){
    super(); // 부모 생성자 호출
  }

  Person(String name) {
//    super(); 생략가능
    this.name = name;
  }

  Person(String name, int age) {
//    super();
//    this.name = name;
    this(name); // 다른 생성자 메소드 호출 : 코드 재사용성
    this.age = age;
  }

  // 메소드(method) : 행위정의
  void smile(){
    System.out.println("웃다");
  }
  void eat() {
    System.out.println("먹다");
  }

  String getName() {
    return name;
  }

  int getAge(){
    return age;
  }

  void setAge(int age){
    if(age < 1) return;
    this.age = age;
  }

  String getNickname() {
    return nickname;
  }

  void setNickname(String nickname){
    this.nickname = nickname;
  }

}
