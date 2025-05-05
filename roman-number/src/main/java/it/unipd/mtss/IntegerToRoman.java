////////////////////////////////////////////////////////////////////
// NICOLA SIMIONATO 2113190
// LUCA MARCUZZO 2113198
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.security.InvalidParameterException;

public class IntegerToRoman {
  public static String convert(int num) {
    if(num <=0) {
      throw new InvalidParameterException();
    }

    int[] numbers = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    String[] romans = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    String conv = "";

    for(int i=numbers.length-1; i>=0; i--) {
      while(num >= numbers[i]) {
        conv += romans[i];
        num -= numbers[i];
      }
    }
    return conv;
  }
}