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

    public String getInfo(){ return productNumber + ": " + name; }

    public int getPrice(){return price;}

    @Override
    public int getProductNumber() {
        return productNumber;
    }

    @Override
    public String examine() {
        return "name: " + name + " / price: " + price + "kr" + " / size: " + size  + " / calories: " + calories;
    }

    @Override
    public String use() {
        return "You bought " + name + " for " + price + "kr";
    }
}
