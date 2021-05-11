package org.skylan.models;

public class VendingMachineImplementation implements VendingMachine{

    private int depositPool;
    private Product[] products;

    public VendingMachineImplementation(int depositPool, Product[] products){
        products = new Product[2];
        products[0] = new ChocolateBar(1,25, "Marabou apelsinkrokant", "250g", "nötter", 1000, "plastic wrap");
        products[1] = new Cider(2,25, "Apple cider", "330ml", "apple", 150, "plastic bottle");
        products[2] = new Fruit(3,25, "Pear", "250g", 60);
    }

    @Override
    public void addCurrency(int amount) {

    }

    @Override
    public Product request(int productNumber) {
        return null;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription(int productNumber) {
        return null;
    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }
}
