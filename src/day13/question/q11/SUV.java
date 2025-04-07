package day13.question.q11;

public class SUV extends AbstractCar {
  public SUV(String brand, String model) {
    super(brand, model);
  }

  @Override
  public void start() {
    System.out.println("Starting SUV : " + brand + " " + model);
  }
}
