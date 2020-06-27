package com.epam.rd.java.basic.practice1;

public class Part3 {

    public static void main(String[] params) {
                      if (params.length > 0) {
                    params[params.length-1] = params[params.length-1].trim();
        }
        System.out.print(String.join(" ", params));
    }

}
