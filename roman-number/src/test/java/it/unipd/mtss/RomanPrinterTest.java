package it.unipd.mtss;

import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class RomanPrinterTest {

    @Test
    public void testPrintOne() {
        //Arrange
        int roman = 1;
        //Act
        String result = RomanPrinter.print(roman);
        //Assert
        assertEquals("  _____  \n |_   _| \n   | |   \n   | |   \n  _| |_  \n |_____| \n", result);
    }

    @Test
    public void testPrintFour() {
        //Arrange
        int roman = 4;
        //Act
        String result = RomanPrinter.print(roman);
        //Assert
        assertEquals("  _____   __      __ \n |_   _|  \\ \\    / / \n   | |     \\ \\  / /  \n   | |      \\ \\/ /   \n  _| |_      \\  /    \n |_____|      \\/     \n", result);
    }

    @Test
    public void testPrintFive() {
        //Arrange
        int number = 5;
        //Act
        String result = RomanPrinter.print(number);
        //Assert
        assertEquals(" __      __ \n \\ \\    / / \n  \\ \\  / /  \n   \\ \\/ /   \n    \\  /    \n     \\/     \n", result);
    }

    @Test
    public void testPrintNine() {
        //Arrange
        int number = 9;
        //Act
        String result = RomanPrinter.print(number);
        //Assert
        assertEquals("  _____   __   __ \n |_   _|  \\ \\ / / \n   | |     \\ V /  \n   | |      > <   \n  _| |_    / . \\  \n |_____|  /_/ \\_\\ \n", result);
    }

    @Test
    public void testPrintTen() {
        //Arrange
        int number = 10;
        //Act
        String result = RomanPrinter.print(number);
        //Assert
        assertEquals(" __   __ \n \\ \\ / / \n  \\ V /  \n   > <   \n  / . \\  \n /_/ \\_\\ \n", result);
    }

    @Test
    public void testPrintForty() {
        //Arrange
        int number = 40;
        //Act
        String result = RomanPrinter.print(number);
        //Assert
        assertEquals(" __   __   _       \n \\ \\ / /  | |      \n  \\ V /   | |      \n   > <    | |      \n  / . \\   | |____  \n /_/ \\_\\  |______| \n", result);
    }

    @Test
    public void testPrintFifty() {
        //Arrange
        int number = 50;
        //Act
        String result = RomanPrinter.print(number);
        //Assert
        assertEquals("  _       \n | |      \n | |      \n | |      \n | |____  \n |______| \n", result);
    }

    @Test
    public void testPrintNinety() {
        //Arrange
        int number = 90;
        //Act
        String result = RomanPrinter.print(number);
        //Assert
        assertEquals(" __   __    _____  \n \\ \\ / /   / ____| \n  \\ V /   | |      \n   > <    | |      \n  / . \\   | |____  \n /_/ \\_\\   \\_____| \n", result);
    }

    @Test
    public void testPrintOneHundred() {
        //Arrange
        int number = 100;
        //Act
        String result = RomanPrinter.print(number);
        //Assert
        assertEquals("   _____  \n  / ____| \n | |      \n | |      \n | |____  \n  \\_____| \n", result);
    }

    @Test
    public void testPrintFourHundred() {
        //Arrange
        int number = 400;
        //Act
        String result = RomanPrinter.print(number);
        //Assert
        assertEquals("   _____    _____   \n  / ____|  |  __ \\  \n | |       | |  | | \n | |       | |  | | \n | |____   | |__| | \n  \\_____|  |_____/ \n", result);
    }

    @Test
    public void testPrintFiveHundred() {
        //Arrange
        int number = 500;
        //Act
        String result = RomanPrinter.print(number);
        //Assert
        assertEquals("  _____   \n |  __ \\  \n | |  | | \n | |  | | \n | |__| | \n |_____/ \n", result);
    }

    @Test
    public void testPrintNineHundred() {
        //Arrange
        int number = 900;
        //Act
        String result = RomanPrinter.print(number);
        //Assert
        assertEquals("   _____    __  __  \n  / ____|  |  \\/  | \n | |       | \\  / | \n | |       | |\\/| | \n | |____   | |  | | \n  \\_____|  |_|  |_| \n", result);
    }

    @Test
    public void testPrintOneThousand() {
        //Arrange
        int number = 1000;
        //Act
        String result = RomanPrinter.print(number);
        //Assert
        assertEquals("  __  __  \n |  \\/  | \n | \\  / | \n | |\\/| | \n | |  | | \n |_|  |_| \n", result);
    }

    @Test(expected = InvalidParameterException.class)
    public void testInvalidRoman() {
        //Arrange
        int number = 0;
        //Act
        String result = RomanPrinter.print(number);
        //Assert
        fail();
    }
}