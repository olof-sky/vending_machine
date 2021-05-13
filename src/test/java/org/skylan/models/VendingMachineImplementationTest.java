package org.skylan.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class VendingMachineImplementationTest {

    VendingMachineImplementation vendingMachine;

    @BeforeEach
    void setUp(){
        vendingMachine = new VendingMachineImplementation();
    }

    @Test
    void addCurrency() {
        int expected = AcceptedValues.FIFTY.getMoney();
        vendingMachine.addCurrency(expected);
        assertEquals(expected, vendingMachine.getBalance());
    }

    @Test
    void request() {
        vendingMachine.addCurrency(AcceptedValues.FIFTY.getMoney());
        String expected = ("1: Marabou apelsinkrokant");
        String actual = vendingMachine.request(1).getInfo();
        assertEquals(expected, actual);
    }

    @Test
    void failedRequestProductNumberNull() {
        vendingMachine.addCurrency(AcceptedValues.FIFTY.getMoney());
        assertThrows(RuntimeException.class, () -> {
            vendingMachine.request(7).getInfo();
        });
    }

    @Test
    void endSession() {
        int expected = 0;
        vendingMachine.addCurrency(AcceptedValues.FIFTY.getMoney());
        vendingMachine.endSession();
        int actual = vendingMachine.getBalance();
        assertEquals(expected, actual);
    }

    @Test
    void getDescription() {
        String exptected = "name: Marabou apelsinkrokant / price: 25kr / size: 250g / allergens: Nuts / calories: 1000 / packaging: Plastic wrap";
        String actual = vendingMachine.getDescription(1);
        assertEquals(exptected, actual);
    }

    @Test
    void getDescriptionFails_ProductNumberDoesntExist(){
        String exptected = null;
        String actual = vendingMachine.getDescription(6);
        assertEquals(exptected, actual);
    }

    @Test
    void getBalance() {
        vendingMachine.addCurrency(AcceptedValues.FIFTY.getMoney());
        int expected = 50;
        int actual = vendingMachine.getBalance();
        assertEquals(expected, actual);
    }

    @Test
    void getProducts() {
        String[] expected = new String[3];
        expected[0] = "1: Marabou apelsinkrokant";
        expected[1] = "2: Apple cider";
        expected[2] = "3: Pear";
        String[] actual = vendingMachine.getProducts();
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}