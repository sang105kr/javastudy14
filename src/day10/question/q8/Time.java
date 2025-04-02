package day10.question.q8;
// 문제 8: Time.java
// 시간을 모델한다
public class Time {
  private int hour;  // 시
  private int minute;  // 분
  private int second;  // 초

  // 시를 반환한다
  public int getHour() {
    return hour;
  }

  // 분을 반환한다
  public int getMinute() {
    return minute;
  }

  // 초를 반환한다
  public int getSecond() {
    return second;
  }

  // 시를 주어진 값으로 변경한다
  public void setHour(int hr) {
    hour = hr;
  }

  // 분을 주어진 값으로 변경한다
  public void setMinute(int min) {
    minute = min;
  }

  // 초를 주어진 값으로 변경한다
  public void setSecond(int sec) {
    second = sec;
  }

  // 시를 주어진 양만큼 조정한다
  public void adjustHour(int hr) {
    hour = hour + hr;
  }

  // 분을 주어진 양만큼 조정한다
  public void adjustMinute(int min) {
    minute = minute + min;
  }

  // 초를 주어진 양만큼 조정한다
  public void adjustSecond(int sec) {
    second = second + sec;
  }

  // 현재 시간을 출력한다
  public void printTime() {
    System.out.println("현재 시간: " + getHour() + "시 " + getMinute() + "분 " + getSecond() + "초");
  }

}
