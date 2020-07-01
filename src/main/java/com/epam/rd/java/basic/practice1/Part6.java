package com.epam.rd.java.basic.practice1;

public class Part6 {

    public static void main(String[] args) {
        int indeks = Integer.parseInt(args[0]);
        int[] massivProstihChisel = new int[indeks];
        int testChislo = 2;
        int kudaStavimChislo = 0;
        StringBuilder strTask6 = new StringBuilder();
        boolean isSimple;
        while (kudaStavimChislo < indeks) {
            int i = 0;
            isSimple = true;
            while (isSimple && i < kudaStavimChislo) {
                if (testChislo % massivProstihChisel[i] == 0) {
                    isSimple = false;
                }
                i++;
            }
            if (isSimple) {
                massivProstihChisel[kudaStavimChislo] = testChislo;
                kudaStavimChislo++;
                testChislo++;
            } else {
                testChislo++;
            }
        }
        for (int i = 0; i < massivProstihChisel.length; i++) {
            if (i == 0) {
                strTask6.append(massivProstihChisel[i]);
            } else {
                strTask6.append(" " + massivProstihChisel[i]);
            }
        }
        Demo.printTask(strTask6.toString());
    }
}
