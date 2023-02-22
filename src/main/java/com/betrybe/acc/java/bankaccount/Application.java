package com.betrybe.acc.java.bankaccount;

import java.util.Scanner;

/**
 * A class.
 */
public class Application {

  /**
   * A simple get method.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    AccountNumberFormatter formatter = new AccountNumberFormatter();

    System.out.println("Informe o número da conta: ");

    try {
      int accountNumber = scanner.nextInt();
      String account = formatter.formatAccountNumber(accountNumber);

      System.out.println("Numero da conta: " + accountNumber);
    } catch (Exception e) {
      System.out.println("Numero da conta inválido!");
    } finally {
      scanner.close();
    }
  }

}
