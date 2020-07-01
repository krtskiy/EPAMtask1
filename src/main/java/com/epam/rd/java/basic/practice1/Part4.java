package com.epam.rd.java.basic.practice1;

public class Part4 {

    public static void main(String[] args) {
        int firstNumber = Integer.valueOf(args[0]);
        int secondNumber = Integer.valueOf(args[1]);
        while (firstNumber != 0 && secondNumber != 0) {
            if (firstNumber > secondNumber) {
                firstNumber %= secondNumber;
            }
            else {
                secondNumber %= firstNumber;
            }
        }
//        System.out.print(secondNumber + firstNumber);
//        Just for eMentor
        int gcd = secondNumber + firstNumber;
        String strTask4 = Integer.toString(gcd);
        Demo.printTask(strTask4);
    }

}
