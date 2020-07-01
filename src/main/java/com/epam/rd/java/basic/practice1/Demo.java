package com.epam.rd.java.basic.practice1;


public class Demo {

    public static void main(String[] args) {
        Part1.main(new String[]{});

        Demo.printTask("\n");

        Part2.main(new String[]{"17", "22", "3"});

        Demo.printTask("\n");

        Part3.main(new String[]{"4", "2", "0", "endWithoutSpaces"});

        Demo.printTask("\n");

        Part4.main(new String[]{"30", "12"});

        Demo.printTask("\n");

        Part5.main(new String[]{"6528"});

        Demo.printTask("\n");

        Part6.main(new String[]{"9"});

        Demo.printTask("\n");

        Part7.main(new String[]{});
    }

    public static void printTask(String args) {
        System.out.print(args);
    }
}
