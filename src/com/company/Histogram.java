package com.company;

import java.util.Random;

public class Histogram {
    public static void createHistogram() {

        DataCollector dtc = new DataCollector();
        System.out.println("Give a number");
        int size = dtc.getInt();
        System.out.println("Random array is created - size: " + size);
        createRank(createArray(size));
        dtc.close();
    }

    private static int[] createArray(int size) {

        Random random = new Random();
        int[] tab = new int[size];
        for(int i = 0; i < size; i++) {
            tab[i] = random.nextInt(100);
            System.out.println(tab[i]);
        }
        return tab;
    }

    private static int[] createRank(int[] rank) {

        int[] score = new int[10];
        for (int low = 0; low <=90; low = low + 10)
            for (int i = 0; i <10; i++) {
                int high = low + 10;
                score[i] = inRange(rank, low, high);
                System.out.println("Histogram: low - "
                        + low + " high - " + high + " results: " + score[i]);
                break;
            }
        return score;
    }

    private static int inRange(int[] rank, int low, int high) {
        int count = 0;
        for(int i = 0; i<rank.length; i++){
            if(rank[i]>= low && rank[i]<=high) {
                count++;
            }
        }
        return count;
    }
}
