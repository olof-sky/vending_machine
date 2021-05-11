package org.skylan.models;

public class Fruit implements Product{

    private int productNumber;
    private int price;
    private String name;
    private String size;
    private int calories;

    public Fruit(int productNumber, int price, String name, String size, int calories){
        this.productNumber = productNumber;
        this.price = price;
        this.name = name;
        this.size = size;
        this.calories = calories;
    }

    @Override
    public String examine() {
        return null;
    }

    @Override
    public String use() {
        return "You put " + name + " in the basket.";
    }
}
