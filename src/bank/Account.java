package bank;

public class Account {
  //속성
  private String accountName;     // 예금주명
  private int balance;            // 잔액
  private String accountNumber;   // 계좌번호

  private static int accountNum;  // 계좌번호 카운트
  private static final int ACCOUNT_NUM_SIZE = 3; // 계좌번호자리수

  /**
   * 생성자
   * @param accountName 예금주명
   */
  public Account(String accountName) {
    // super();
    this.accountName = accountName;
    //계좌번호 생성
    accountNumber = makeAccountNumber();
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

  /**
   * 계좌번호 생성
   * @return 계좌번호
   */
  private String makeAccountNumber() {
    String str = String.valueOf(++accountNum);    // "11"
    int zeroCnt = ACCOUNT_NUM_SIZE - str.length(); // 1 -> "011"
    for (int i = 0; i < zeroCnt; i++) {
      str = "0" + str;
    }
    return str;
  }
}
