package day13.question.q10;

class SmartPhone extends AbstractPhone{

  public SmartPhone(String brand, String model) {
    super(brand, model);
  }

  @Override
  public void call() {
    System.out.println("Calling from Smartphone" +  brand + " " + model);
  }
}
