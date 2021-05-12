package org.skylan;

import org.skylan.models.VendingMachineImplementation;
import org.skylan.service.BuyProduct;
import org.skylan.service.InputMoney;
import java.util.Scanner;

public class App {

    private final static VendingMachineImplementation INSTANCE;
    static {
        INSTANCE = new VendingMachineImplementation();
    }
    public static VendingMachineImplementation getVendingMachineInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputMoney money = new InputMoney();
        BuyProduct buy = new BuyProduct();
        boolean run = true;
        while (run){
            System.out.println(
                    "\nWhat would you like to do?\n\n" +
                    "1. Input money\n" +
                    "2. Buy products\n" +
                    "3. View all products\n" +
                    "4. View product description\n" +
                    "6. Examine product\n");
            System.out.print("Pick an operation: ");
            int toDo = scanner.nextInt();
            switch(toDo){
                case 1: money.input();
                    break;
                case 2: buy.buyProduct();
                    break;
                case 3: for (int i = 0; i< getVendingMachineInstance().getProducts().length + 1;i++)
                    { System.out.println(getVendingMachineInstance().getDescription(i));}
                    break;
                case 4: System.out.println("\nWhich product would you like to view?");
                    for (String product : App.getVendingMachineInstance().getProducts()) {
                        System.out.println(product);
                    }
                    System.out.print("\nChoose product: ");
                    int productNumber = scanner.nextInt();
                    System.out.println(getVendingMachineInstance().getDescription(productNumber));
                    break;
            }
        }
    }
}