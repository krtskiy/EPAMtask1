package com.epam.rd.java.basic.practice1;


public class Demo {

    public static void main(String[] args) {
        String str = "\n~~~~~~~~~~";

        Part1.main(new String[]{});

        System.out.println(str);

        Part2.main(new String[]{"17", "22", "3"});

        System.out.println(str);

        Part3.main(new String[]{"4", "2", "0", "endWithoutSpaces"});

        System.out.println(str);

        Part4.main(new String[]{"30", "12"});

        System.out.println(str);

        Part5.main(new String[]{"6528"});

        System.out.println(str);

        Part6.main(new String[]{"9"});

        System.out.println(str);

        Part7.main(new String[]{});
    }

    public static void printTask(String args) {
        System.out.print(args);
    }
}
