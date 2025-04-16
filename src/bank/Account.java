package bank;

public class Account {
  //속성 :  예금주이름, 잔고, 계좌번호
  private String accountName;
  private int balance;
  private String accountNumber;

  //생성자
  public Account(String accountName) {
    // super();
    this.accountName = accountName;
    //계좌번호 생성
    accountNumber = makeAccountNumber();
  }

  private String makeAccountNumber() {
    //
    return null;
  }

  //기능 :  입금, 출금, 조회
  public void deposit(int money){

  }

  public void withdraw(int money) {

  }

  public String getAccountInfo() {
    return "예금주명 : " + accountName + "," +
        "잔고 : " + balance + "," +
        "계좌번호 " + accountNumber;
  }

  public String getAccountName() {
    return accountName;
  }
}
