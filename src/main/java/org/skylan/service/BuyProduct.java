package org.skylan.service;

import org.skylan.App;
import java.util.Scanner;

public class BuyProduct {

    public void buyProduct() {
        Scanner scanner = new Scanner(System.in);
        boolean shopping = true;
        while (shopping) {
            System.out.println("\nBuy a product");
            for (String product : App.getVendingMachineInstance().getProducts()) {
                System.out.println(product);
            }
            int choice = scanner.nextInt();
            try {
                System.out.println(App.getVendingMachineInstance().request(choice).use());
            } catch (ArrayIndexOutOfBoundsException productNotInList) {
                    System.out.println("Product is not in list");
            } catch (NullPointerException needMoreMoney) {
                System.out.println("Not enough money in the deposit");
            }
            shopping = false;
        }
    }
}
