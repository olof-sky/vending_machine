package org.skylan.models;

public class Cider implements Product{

    private int productNumber;
    private int price;
    private String name;
    private String size;
    private String allergens;
    private int calories;
    private String packaging;

    public Cider(int productNumber, int price, String name, String size, String allergens, int calories, String packaging){
        this.productNumber = productNumber;
        this.price = price;
        this.name = name;
        this.size = size;
        this.allergens = allergens;
        this.calories = calories;
        this.packaging = packaging;
    }

    public String getInfo(){
        return productNumber + ": " + name;
    }

    public int getPrice(){return price;}

    @Override
    public int getProductNumber() {
        return productNumber;
    }

    @Override
    public String examine() {
        return "name: " + name + " / price: " + price + "kr" + " / size: " + size + " / allergens: " + allergens + " / calories: " + calories + " / packaging: " + packaging;
    }

    @Override
    public String use() {
        return "You bought " + name + " for " + price + "kr";
    }
}
