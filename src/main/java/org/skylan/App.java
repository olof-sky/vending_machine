package org.skylan;


import org.skylan.models.AcceptedValues;
import org.skylan.models.VendingMachineImplementation;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        VendingMachineImplementation vendingMachine = new VendingMachineImplementation();
        Scanner scanner = new Scanner(System.in);
        boolean insertingMoney = true;
        boolean run = true;
        while (run){
            while (insertingMoney) {
                System.out.println("Insert money: 1kr, 2kr, 5kr, 10kr, 20kr, 50kr, 100kr, 200kr, 500kr, 1000kr\nCurrent balance is: "+vendingMachine.getBalance());
                int insertedMoney = scanner.nextInt();
                switch(insertedMoney){
                    case 1: vendingMachine.addCurrency(AcceptedValues.ONE.getMoney());
                        break;
                    case 2: vendingMachine.addCurrency(AcceptedValues.TWO.getMoney());
                        break;
                    case 5: vendingMachine.addCurrency(AcceptedValues.FIVE.getMoney());
                        break;
                    case 10: vendingMachine.addCurrency(AcceptedValues.TEN.getMoney());
                        break;
                    case 20: vendingMachine.addCurrency(AcceptedValues.TWENTY.getMoney());
                        break;
                    case 50: vendingMachine.addCurrency(AcceptedValues.FIFTY.getMoney());
                        break;
                    case 100: vendingMachine.addCurrency(AcceptedValues.ONEHUNDRED.getMoney());
                        break;
                    case 200: vendingMachine.addCurrency(AcceptedValues.TWOHUNDRED.getMoney());
                        break;
                    case 500: vendingMachine.addCurrency(AcceptedValues.FIVEHUNDRED.getMoney());
                        break;
                    case 1000: vendingMachine.addCurrency(AcceptedValues.ONETHOUSAND.getMoney());
                        break;
                    default: System.out.println("Invalid input");
                        break;
                }
            }
        }
    }
}