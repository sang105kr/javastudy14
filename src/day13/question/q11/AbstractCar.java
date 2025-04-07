package day13.question.q11;

abstract class AbstractCar implements Vehicle{
  protected String brand;
  protected String model;
  static final int NUMBER_OF_WHEELS = 4;

  public AbstractCar(String brand, String model) {
    this.brand = brand;
    this.model = model;
  }

  @Override
  public void stop(){
    System.out.println("stoping " + brand + " " + model);
  }
}
