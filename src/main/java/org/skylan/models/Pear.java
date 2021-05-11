package org.skylan.models;

import org.skylan.sequencer.ProductNumberSequencer;

public class Pear implements Product{

    private int productNumber;
    private int price;
    private String name;
    private String size;
    private int calories;

    public Pear(int productNumber, int price, String name, String size, int calories){
        this.productNumber = productNumber;
        this.price = price;
        this.name = name;
        this.size = size;
        this.calories = calories;
    }

    public Pear(int price, String name, String size, int calories){this(ProductNumberSequencer.getNextId(), price, name, size, calories);}

    @Override
    public String examine() {
        return null;
    }

    @Override
    public String use() {
        return "You put " + name + " in the basket.";
    }
}
