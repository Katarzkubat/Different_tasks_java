package com.company;

public class Factorial {

    public int countFactorial() {

        DataCollector dtc = new DataCollector();
        System.out.println("Give a number: ");
        int num = dtc.getInt();
        dtc.close();

        if(num == 0) {
            return 1;

        } int fact = 1;

        for (int div = 1; div <= num; div++) {
            fact *= div;

        }
        System.out.println("Factorial: " + fact);
        return fact;

        }
    }
