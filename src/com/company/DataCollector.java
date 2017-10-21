package com.company;

import java.util.Scanner;

public class DataCollector {

    private Scanner sc;

    public DataCollector() {
        sc = new Scanner(System.in);
    }

    public void close() {
        sc.close();
    }

    public int getInt() {
        int number = sc.nextInt();
        return number;
    }

    public String getString() {
        String word = sc.nextLine();
        return word;
    }

}


