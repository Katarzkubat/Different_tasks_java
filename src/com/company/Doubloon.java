package com.company;

public class Doubloon {

    public boolean isDoubloon() {

        DataCollector dtc = new DataCollector();
        System.out.println("Give a word.");
        String loverCase = dtc.getString().toLowerCase();
        dtc.close();

        for (int i = 0; i < loverCase.length() - 1; i++) {
            char test = loverCase.charAt(i);
            int count = loverCase.length() - loverCase.replace(test + "", "").length();
            if(count != 2 || loverCase.indexOf(test) == loverCase.lastIndexOf(test)) {
                System.out.println("Not, this is not a doubloon");
                return false;
            }
        }
        System.out.println("Yes, This is a doubloon");
        return true;
    }
}
