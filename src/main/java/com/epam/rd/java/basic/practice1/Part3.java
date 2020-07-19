package com.epam.rd.java.basic.practice1;

public class Part3 {

    public static void main(String[] args) { //NOSONAR
        StringBuilder strTask3 = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            if (i == 0) {
                strTask3.append(args[i]);
            } else {
                strTask3.append(" " + args[i]);
            }
        }
        Demo.printTask(strTask3.toString());
    }

}
