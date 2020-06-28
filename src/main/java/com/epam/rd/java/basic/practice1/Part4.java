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
        System.out.println(secondNumber + firstNumber);
    }

}
