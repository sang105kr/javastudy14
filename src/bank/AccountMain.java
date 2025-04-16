package bank;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AccountMain {

  static Scanner scanner = new Scanner(System.in);
  static final int ACCOUNT_MAX_SIZE = 3;  // 계좌 개설 개수
  static Account[] accounts = new Account[ACCOUNT_MAX_SIZE];

  public static void main(String[] args) {
    boolean stop = false;
    while (!stop) {
      System.out.println("1.신규 2.폐지 3.입금 4.출금 5.계좌조회(개별) 6.계좌조회(전체) 7.종료(x)");
      System.out.print("선택 >> ");
      int menu = scanner.nextInt();
      scanner.nextLine();

      switch (menu) {
        case 1 : // 신규
          addAccount();
          break;
        case 2 : // 폐지
          closingAccount();
          break;
        case 3 : // 입금
          break;
        case 4 : // 출금
          break;
        case 5 : // 계좌조회(개별)
          break;
        case 6 : // 계좌조회(전체)
          listAccount();
          break;
        case 7 : // 종료(x)
          stop = true;
          continue;
        default :
          System.out.println("메뉴선택(1~7) 선택바랍니다.");
      }// end of switch
    } // end of while
  }// end of main

  // 전체조회
  private static void listAccount() {
    for (Account account : accounts) {
      if(account != null){
        System.out.println(account.getAccountInfo());
      }
    }
  }

  private static void closingAccount() {
  }

  //계좌 생성
  private static void addAccount() {
    //1) 계좌 개설수 확인
    int sum = 0;
    for(Account account : accounts){
      if(account != null) {
        sum++;
      }
    }
    if( sum == ACCOUNT_MAX_SIZE){
      System.out.println("계좌 개설수를 초과!");
      return;
    }
    //2) 계좌 개설
    String accoutName = null;
    boolean isSame = false;
    while (!isSame) {
      System.out.print("예금주명 : ");
      accoutName = scanner.nextLine();

      //3) 동명이인 확인
      for(Account account : accounts){
        if(account != null) {
          if(accoutName.equals(account.getAccountName())){
            System.out.println("동명이인이 존재합니다.");
            isSame = true;
            break;
          }
        }
      }
      if(!isSame){
        //4) 계좌 개설
        for (int i=0; i<accounts.length; i++) {
          if (accounts[i] == null) {
            accounts[i] = new Account(accoutName);
            break;
          }
        }
        break;
      }
    }// end of while
  }


}// end of class
