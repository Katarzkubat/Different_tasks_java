package com.company;

import java.util.Random;

public class BobbleSorting {

    public void sortBobble() {

        Random random = new Random();
        int[] randomArray = new int[50];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100);
        }
        sort(randomArray);
    }

    public int[] sort(int[] tab) {

        int place;

        for (int i = 0; i<tab.length;  i++) {
            for (int j = 1; j<tab.length-i; j++) {

                if(tab[j-1]> tab[j]) {
                    place = tab[j - 1];
                    tab[j - 1] = tab[j];
                    tab[j] = place;
                }
            }
        }

        System.out.print("Sorted randomArray: ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + "  ");
        }
        return tab;
    }
}
