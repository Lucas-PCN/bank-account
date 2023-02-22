package com.betrybe.acc.java.bankaccount;

import org.apache.commons.lang3.StringUtils;


/**
 * AccountNumberFormatter.
 */
public class AccountNumberFormatter {

  /**
   * Formata o número da conta.
   *
   * @param literalAccountNumber número da conta
   */
  public String formatAccountNumber(int literalAccountNumber) {
    int accountDigitsMax = 6;
    String account = Integer.toString(literalAccountNumber);
    
    if (account.length() < accountDigitsMax) {
      return StringUtils.leftPad(account, accountDigitsMax, "0");
    }
    
    if (account.length() > accountDigitsMax) {
      return StringUtils.right(account, accountDigitsMax);
    }
    
    return account;
  }

}