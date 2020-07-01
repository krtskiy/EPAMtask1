package com.epam.rd.java.basic.practice1;

public class Part3 {

    public static void main(String[] args) {
//        System.out.print(String.join(" ", args).trim());
        String strTask3 = "";
        for (int i = 0; i < args.length; i++) {
            if (i == 0) {
                strTask3 += args[i];
            } else {
                strTask3 += (" " + args[i]);
            }
        }
//        Just for eMentor
        Demo.printTask(strTask3);
    }

}
