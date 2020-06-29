package com.epam.rd.java.basic.practice1;

public class Part7 {

    public static void main(String[] args) {
        String arrow = " ==> ";
        String sb = "A" + arrow + str2int("A") + arrow + int2str(1) + "\n" +
                "B" + arrow + str2int("B") + arrow + int2str(2) + "\n" +
                "Z" + arrow + str2int("Z") + arrow + int2str(26) + "\n" +
                "AA" + arrow + str2int("AA") + arrow + int2str(27) + "\n" +
                "AZ" + arrow + str2int("AZ") + arrow + int2str(52) + "\n" +
                "BA" + arrow + str2int("BA") + arrow + int2str(53) + "\n" +
                "ZZ" + arrow + str2int("ZZ") + arrow + int2str(702) + "\n" +
                "AAA" + arrow + str2int("AAA") + arrow + int2str(703) + "\n";
        System.out.print(sb);
    }

    public static int str2int(String number) {
        int digit = 0;
        for (int i = 1, j = number.length(); j > 0; i++, j--) {
            digit += (int) (number.charAt(number.length() - i) - 64) * Math.pow(26, number.length() - j);
        }
        return digit;
    }

    public static String int2str(int number) {
        String chars = "";
        String charsMirror = "";
        int modul;
        int divident = number;
        while (divident != 0) {
            modul = divident % 26;
            if (modul == 0) {
                chars += "Z";
                divident = (divident - 1) / 26;
            } else {
                chars += (char) (modul + 64);
                divident = (divident - modul) / 26;
            }
        }
        for (int i = 0; i < chars.length(); i++)
            charsMirror += chars.charAt(chars.length() - i - 1);
        return charsMirror;
    }

    public static String rightColumn(String number) {
        String chars;
        int num;
        num = str2int(number);
        num++;
        chars = int2str(num);
        return chars;
    }
}
