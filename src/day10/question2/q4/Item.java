package day10.question2.q4;

// 객체설계연습_3 문제 4: Item.java
// 한 상품을 모델한다
public class Item {
  private String name;  // 이름
  private int price;    // 가격
  private int quantity;  // 수량

  //  객체 변수들의 값을 주어진 값들을 초기화하면서 새로운 Item 객체를 생성한다
  public Item(String name, int price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  //   상품의 현 상태를 반환한다
  public String toString() {
    return (name + "\t\t" + price + "\t" + quantity + "\t" + price * quantity);
  }

  //   상품의 가격을 반환한다
  public int getPrice() {
    return price;
  }

  //   상품의 이름을 반환한다
  public String getName() {
    return name;
  }

  //   상품의 수량을 반환한다
  public int getQuantity() {
    return quantity;
  }

  //   상품의 이름을 주어진 값으로 변경한다
  public void setName(String itemName) {
    name = itemName;
  }

  //   상품의 가격을 주어진 값으로 변경한다
  public void setPrice(int itemPrice) {
    price = itemPrice;
  }

  // 상품의 수량을 주어진 값으로 변경한다
  public void setQuantity(int numPurchased) {
    quantity = numPurchased;
  }

}
