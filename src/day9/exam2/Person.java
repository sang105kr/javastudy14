package day9.exam2;

public class Person {
  //필드
  private String name;
  private int age;
  private String nickname;

  //생성자
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  //메소드
  void smile(){
    System.out.println("웃다");
  }
  void eat(){
    System.out.println("먹다");
  }

  //getter, setter

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    if(!(nickname.length() >= 2 && nickname.length() <=10) ) return;
    this.nickname = nickname;
  }
}
