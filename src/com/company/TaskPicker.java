package com.company;

public class TaskPicker {

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        Histogram histogram = new Histogram();
        Doubloon doubloon = new Doubloon();
        Palindrome palindrome = new Palindrome();
        BobbleSorting bobble = new BobbleSorting();

        DataCollector dtc = new DataCollector();

        Task task;

        System.out.println("You can choose different task:");
        for (Task t : Task.values()) {
            System.out.println(t.getDescription());
        }

        System.out.println("Choose number from 0 to 5");
        Boolean manualExit = false;
        while (!manualExit && (task = Task.createFromInt(dtc.getInt())) != Task.EXIT) {
            switch (task) {
                case PALINDROME:
                    System.out.println("Palindrome is chosen.");
                    palindrome.isPalindrome();
                    break;

                case FACTORIAL:
                    System.out.println("Factorial is chosen.");
                    factorial.countFactorial();
                    break;

                case DOUBLOON:
                    System.out.println("Doubloon is chosen.");
                    doubloon.isDoubloon();
                    break;

                case HISTOGRAM:
                    System.out.println("Histogram is chosen.");
                    histogram.createHistogram();
                    break;

                case BOBBLE_SORTING:
                    System.out.println("BoobleSorting is chosen.");
                    bobble.sortBobble();
                    break;

                case EXIT:
                          ;
            }
            manualExit = true;
        }

    }
}
