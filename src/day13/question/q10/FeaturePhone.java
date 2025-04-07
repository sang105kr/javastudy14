package day13.question.q10;

public class FeaturePhone extends AbstractPhone{

  public FeaturePhone(String brand, String model) {
    super(brand, model);
  }

  @Override
  public void call() {
    System.out.println("Calling from Feature Phone" + brand + " " + model);
  }
}
