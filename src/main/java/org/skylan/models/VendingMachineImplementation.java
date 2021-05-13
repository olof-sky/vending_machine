package org.skylan.models;

public class VendingMachineImplementation implements VendingMachine{

    public int depositPool;
    private final Product[] products;

    public VendingMachineImplementation(){
        products = new Product[3];
        products[0] = new ChocolateBar(1,25, "Marabou apelsinkrokant", "250g", "Nuts", 1000, "Plastic wrap");
        products[1] = new Cider(2,30, "Apple cider", "330ml", "Apple", 150, "Plastic bottle");
        products[2] = new Fruit(3,7, "Pear", "100g", 60);
    }

    @Override
    public void addCurrency(int amount) {
        depositPool = depositPool + amount;
    }

    @Override
    public Product request(int productNumber) {
        if (productNumber > products.length + 1){
            throw new ArrayIndexOutOfBoundsException();
        }
        for (Product product : products){
            if (productNumber == product.getProductNumber()) {
                if (depositPool > product.getPrice()) {
                    depositPool -= product.getPrice();
                    return product;
                }
            }
        }return null;
    }

    @Override
    public int endSession() {
        int change = depositPool;
        depositPool = 0;
        return change;
    }

    @Override
    public String getDescription(int productNumber) {
        for (Product product : products){
            if (productNumber == product.getProductNumber()){
                return product.examine();
            }
        }return null;
    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public String[] getProducts() {
        String[] returnStringArray = new String[products.length];
        for (int i = 0; i<products.length;i++){
            returnStringArray[i] = products[i].getInfo();
        }
        return returnStringArray;
    }
}
