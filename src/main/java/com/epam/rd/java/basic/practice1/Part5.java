package com.epam.rd.java.basic.practice1;

public class Part5 {

    public static void main(String[] args) { //NOSONAR
        int argsInt = Integer.parseInt(args[0]);
        int result = 0;
        while (argsInt != 0) {
            result += argsInt % 10;
            argsInt /= 10;
        }
        String strtask5 = Integer.toString(result);
        Demo.printTask(strtask5);
    }
	
}
