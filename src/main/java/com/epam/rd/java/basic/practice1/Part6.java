package com.epam.rd.java.basic.practice1;

public class Part6 {
    // I dont understand how it works

    public static void main(String[] args) {
        int indeks = Integer.valueOf(args[0]);
        int[] massivProstihChisel = new int[indeks];
        int testChislo = 2;
        int kudaStavimChislo = 0;
        String strTask6 = "";
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
                strTask6 += (massivProstihChisel[i]);
            } else {
                strTask6 += (" " + massivProstihChisel[i]);
            }
        }
//        Just for eMentor
        Demo.printTask(strTask6);
    }
}
