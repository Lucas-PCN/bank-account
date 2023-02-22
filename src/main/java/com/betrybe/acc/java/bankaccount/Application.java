package com.betrybe.acc.java.bankaccount;

import java.util.Scanner;

/**
 * A class.
 */
public class Application {
  private static Scanner scanner;
  private static AccountNumberFormatter formatter;

  /**
   * A simple get method.
   */
  public static void main(String[] args) {
    scanner = new Scanner(System.in);
    formatter = new AccountNumberFormatter();

    System.out.println("Informe o número da conta:");

    try {
      int accountNumber = scanner.nextInt();
      String account = formatter.formatAccountNumber(accountNumber);

      System.out.println("Numero da conta: " + account);
    } catch (Exception e) {
      System.out.println("Numero da conta inválido!");
    } finally {
      scanner.close();
    }
  }

}
