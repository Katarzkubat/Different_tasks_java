package com.company;

public class Palindrome {


    public static boolean isPalindrome() {

        DataCollector dtc = new DataCollector();
        System.out.println("Write a word");
        String word = dtc.getString();
        dtc.close();
        String reversed = reverseWord(word);

        if (word.equals(reversed)) {
            System.out.println("It's palindrome!");
            return true;
        } else {
            System.out.println("It's not palindrome.");
            return false;
        }

    }

    public static String reverseWord(String word) {
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >=0; i--) {
            reversed.append(word.charAt(i));
        }
        System.out.println("Your reversed word: " + reversed.toString());
        return reversed.toString();
    }
}



