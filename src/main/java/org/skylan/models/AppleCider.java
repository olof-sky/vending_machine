package org.skylan.models;

import org.skylan.sequencer.ProductNumberSequencer;

public class AppleCider implements Product{

    private int productNumber;
    private int price;
    private String name;
    private String size;
    private String allergens;
    private int calories;
    private String packaging;

    public AppleCider(int productNumber, int price, String name, String size, String allergens, int calories, String packaging){
        this.productNumber = productNumber;
        this.price = price;
        this.name = name;
        this.size = size;
        this.allergens = allergens;
        this.calories = calories;
        this.packaging = packaging;
    }

    public AppleCider(int price, String name, String size, String allergens, int calories, String packaging){this(ProductNumberSequencer.getNextId(), price, name, size, allergens, calories, packaging)}

    @Override
    public String examine() {
        return "name: " + name + " size: " + size + " allergens: " + allergens + " calories: " + calories + " packaging: " + packaging;
    }

    @Override
    public String use() {
        return "You put " + name + " in the basket.";
    }
}
