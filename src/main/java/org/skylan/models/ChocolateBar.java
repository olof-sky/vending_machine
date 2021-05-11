package org.skylan.models;

public class ChocolateBar implements Product{

    private int productNumber;
    private int price;
    private String name;
    private String size;
    private String allergens;
    private int calories;
    private String packaging;

    public ChocolateBar(int productNumber, int price, String name, String size, String allergens, int calories, String packaging){
        this.productNumber = productNumber;
        this.price = price;
        this.name = name;
        this.size = size;
        this.allergens = allergens;
        this.calories = calories;
        this.packaging = packaging;
    }

    public String getInfo(){
        return name + productNumber;
    }

    @Override
    public int getProductNumber() {
        return productNumber;
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
