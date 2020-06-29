package com.epam.rd.java.basic.practice1;

public class Part7 {

    public static void main(String[] args) {
        int digit1 = Integer.parseInt(args[0]);
        String char1 = String.valueOf(args[1]);
        String char2 = String.valueOf(args[2]);
        System.out.println(digit1 + " ==> " + Part7.int2str(digit1));
        System.out.println(char1 + " ==> " + Part7.str2int(char1));
        System.out.println(char2 + " ==> " + Part7.rightColumn(char2));
        String strelka = " ==> ";
        System.out.print("A" + strelka + str2int("A") + strelka + int2str(1));
        System.out.print("B" + strelka + str2int("B") + strelka + int2str(2));
        System.out.print("Z" + strelka + str2int("Z") + strelka + int2str(26));
        System.out.print("AA" + strelka + str2int("AA") + strelka + int2str(27));
        System.out.print("AZ" + strelka + str2int("AZ") + strelka + int2str(52));
        System.out.print("BA" + strelka + str2int("BA") + strelka + int2str(53));
        System.out.print("ZZ" + strelka + str2int("ZZ") + strelka + int2str(702));
        System.out.print("AAA" + strelka + str2int("AAA") + strelka + int2str(703));
    }

    public static int str2int(String number) {
        int digit = 0;
        for(int i = 1, j = number.length(); j > 0; i++,j--){
            digit += (int)(number.charAt(number.length() - i) -64) * Math.pow(26,number.length() - j);
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
