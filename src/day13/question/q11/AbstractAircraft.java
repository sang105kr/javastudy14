package day13.question.q11;

abstract class AbstractAircraft implements Aircraft,Vehicle{
  String manufacture;   //제조사
  String model;         //모델

  public AbstractAircraft(String manufacture, String model) {
    this.manufacture = manufacture;
    this.model = model;
  }

  @Override
  public void fly() {

  }

  @Override
  public void fillUp() {

  }
}
