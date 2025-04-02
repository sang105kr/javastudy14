package day10.question2.q3;
// 객체설계연습_3 문제 3: Book.java
// 도서를 모델한다
public class Book {
  private String title;
  private String author;
  private int price;


  //  주어진 값들을 갖는 Book 객체를 생성한다
  public Book(String title, String author, int price) {
    setTitle(title);
    setAuthor(author);
    setPrice(price);
  }

  //   도서의 현 상태를 반환한다
  public String toString() {
    return (title + "\t\t" + author + "\t\t" + price);
  }

  //   도서의 가격을 반환한다
  public int getPrice() {
    return price;
  }

  //   도서명을 반환한다
  public String getTitle() {
    return title;
  }

  //   도서의 저자를 반환한다
  public String getAuthor() {
    return author;
  }

  // 도서명을 주어진 값으로 변경한다
  public void setTitle(String bookTitle) {
    title = bookTitle;
  }

  // 가격을 주어진 값으로 변경한다
  public void setPrice(int bookPrice) {
    price = bookPrice;
  }

  // 저자를 주어진 값으로 변경한다
  public void setAuthor(String bookAuthor) {
    author = bookAuthor;
  }

}
