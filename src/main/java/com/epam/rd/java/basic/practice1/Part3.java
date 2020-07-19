package com.epam.rd.java.basic.practice1;

public class Part3 {

    public static void main(String[] args) {
        StringBuilder strTask3 = new StringBuilder();
        for (int i = 0; i < args.length; i++) { //NOSONAR
            if (i == 0) {
                strTask3.append(args[i]);       //NOSONAR
            } else {
                strTask3.append(" " + args[i]); //NOSONAR
            }
        }
        Demo.printTask(strTask3.toString());
    }

}
