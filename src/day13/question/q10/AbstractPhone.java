package day13.question.q10;

abstract public class AbstractPhone extends Object implements Phone{
  protected String brand;
  protected String model;

  public AbstractPhone(String brand, String model) {
    this.brand = brand;
    this.model = model;
  }

  @Override
  public void sendMessage() {
    System.out.println("Sending message from " + brand + " " + model);
  }
}
