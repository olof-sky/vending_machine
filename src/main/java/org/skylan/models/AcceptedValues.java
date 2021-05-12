package org.skylan.models;

public enum AcceptedValues {
    ONE(1),
    TWO(2),
    FIVE(5),
    TEN(10),
    TWENTY(20),
    FIFTY(50),
    ONEHUNDRED(100),
    TWOHUNDRED(200),
    FIVEHUNDRED(500),
    ONETHOUSAND(1000);

    private final int input;

    private AcceptedValues(int input){
        this.input = input;
    }

    public int getMoney() {
        return input;
    }
}
