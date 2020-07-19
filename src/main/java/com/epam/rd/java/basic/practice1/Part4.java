package com.epam.rd.java.basic.practice1;

public class Part4 {

    public static void main(String[] args) { //NOSONAR
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);
        while (firstNumber != 0 && secondNumber != 0) {
            if (firstNumber > secondNumber) {
                firstNumber %= secondNumber;
            }
            else {
                secondNumber %= firstNumber;
            }
        }
        int gcd = secondNumber + firstNumber;
        String strTask4 = Integer.toString(gcd);
        Demo.printTask(strTask4);
    }

}
