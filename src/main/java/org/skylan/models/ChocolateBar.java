package org.skylan.models;

public class ChocolateBar implements Product{

    private int price;
    private String name;
    private String size;
    private String allergens;
    private int calories;
    private String packaging;

    public ChocolateBar(String name, String size, String allergens, int calories, String packaging){
    }

    @Override
    public String examine() {
        return "name: " + name + " size: " + size + " allergens: " + allergens + " calories: " + calories + " packaging: " + packaging;
    }

    @Override
    public String use() {
        // TODO
        // withdraw price from the deposit pool
        return "You put " + name + " in the basket.";
    }
}
