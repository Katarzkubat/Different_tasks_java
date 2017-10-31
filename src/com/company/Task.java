package com.company;

public enum Task {

    PALINDROME (0, "0: Task presenting palindrome."),
    FACTORIAL (1, "1: Task presenting factorial."),
    HISTOGRAM (2, "2: Task presenting histogram."),
    DOUBLOON (3, "3: Task presenting doubloon."),
    BOBBLE_SORTING (4, "4: Task presenting bobble sorting"),
    EXIT(5,"5: Exit.");

    private int value;
    private String description;


    Task(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public static Task createFromInt(int task) {
        return Task.values()[task];

    }

    @Override
    public String toString() {
        return value + " - " + description;
    }
}
