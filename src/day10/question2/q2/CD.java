package day10.question2.q2;
// 객체설계연습_3 문제 2: CD.java
// 한 음악 CD를 나타낸다
public class CD {
  // 변수들
  private String title;  // 제목
  private String artist;  // 연주자
  private int cost;    // 구입가격

  //  특정 정보를 가진 새로운 CD 객체를 생성한다
  public CD(String title, String artist, int cost) {
    this.title = title;
    this.artist = artist;
    this.cost = cost;
  }

  // CD의 제목을 주어진 값으로 변경한다
  public void setTitle(String name) {
    title = name;
  }

  // CD의 연주자를 주어진 값으로 변경한다
  public void setArtist(String singer) {
    artist = singer;
  }

  // CD의 구입 가격을 주어진 값으로 변경한다
  public void setCost(int price) {
    cost = price;
  }

  // CD의 제목을 반환한다
  public String getTitle() {
    return title;
  }

  // CD의 연주자를 반환한다
  public String getArtist() {
    return artist;
  }

  // CD의 구입 가격을 반환한다
  public int getCost() {
    return cost;
  }

  //  현 CD 객체의 상태를 문자열로 반환한다.
  public String toString() {
    String description;

    description = "제목:\t" + getTitle() + "\t";
    description += "연주자:\t" + getArtist() + "\t";
    description += "구입가격:\t" + getCost();

    return description;
  }

}
