package bank2;

public class TestMain {
  public static void main(String[] args) {
    Account account = new Account("홍길동1");
//    System.out.println(account.accountNum);
    System.out.println(account.getAccountInfo());


    Account account2 = new Account("홍길동2");
//    System.out.println(account.accountNum);
    System.out.println(account2.getAccountInfo());


  }
}
