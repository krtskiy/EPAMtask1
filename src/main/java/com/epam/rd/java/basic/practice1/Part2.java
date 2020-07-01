package com.epam.rd.java.basic.practice1;

public class Part2 {

    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i < args.length; i++) {
            result += Integer.parseInt(args[i]);
        }
        String strTask2 = Integer.toString(result);
        Demo.printTask(strTask2);
    }
}
