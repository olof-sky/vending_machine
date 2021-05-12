package org.skylan.service;

import org.skylan.App;
import org.skylan.models.AcceptedValues;
import java.util.Scanner;

public class InputMoney {
    public void input(){
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run){
            System.out.println("\nInsert money: 1kr, 2kr, 5kr, 10kr, 20kr, 50kr, 100kr, 200kr, 500kr, 1000kr\nCurrent balance is: "+ App.getVendingMachineInstance().getBalance());
            System.out.print("Insert accepted value: ");
            int insertedMoney = scanner.nextInt();
            switch(insertedMoney){
                case 1: App.getVendingMachineInstance().addCurrency(AcceptedValues.ONE.getMoney());
                    break;
                case 2: App.getVendingMachineInstance().addCurrency(AcceptedValues.TWO.getMoney());
                    break;
                case 5: App.getVendingMachineInstance().addCurrency(AcceptedValues.FIVE.getMoney());
                    break;
                case 10: App.getVendingMachineInstance().addCurrency(AcceptedValues.TEN.getMoney());
                    break;
                case 20: App.getVendingMachineInstance().addCurrency(AcceptedValues.TWENTY.getMoney());
                    break;
                case 50: App.getVendingMachineInstance().addCurrency(AcceptedValues.FIFTY.getMoney());
                    break;
                case 100: App.getVendingMachineInstance().addCurrency(AcceptedValues.ONEHUNDRED.getMoney());
                    break;
                case 200: App.getVendingMachineInstance().addCurrency(AcceptedValues.TWOHUNDRED.getMoney());
                    break;
                case 500: App.getVendingMachineInstance().addCurrency(AcceptedValues.FIVEHUNDRED.getMoney());
                    break;
                case 1000: App.getVendingMachineInstance().addCurrency(AcceptedValues.ONETHOUSAND.getMoney());
                    break;
                default: System.out.println("Invalid input");
                    break;
            }
            System.out.println("\nCurrent balance is: "+App.getVendingMachineInstance().getBalance());
            System.out.println("Insert more money? (y/n): ");
            String exit = scanner.next().toLowerCase();
            if (exit.equals("n")){run = false;}
        }
    }
}
