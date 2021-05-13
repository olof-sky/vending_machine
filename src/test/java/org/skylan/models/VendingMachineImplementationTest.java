package org.skylan.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        int expected = 5;
        vendingMachine.addCurrency(expected);
        assertEquals(expected, vendingMachine.getBalance());
    }

    @Test
    void request() {
        vendingMachine.addCurrency(50);
        String expected = ("1: Marabou apelsinkrokant");
        String actual = vendingMachine.request(1).getInfo();
        assertEquals(expected, actual);
    }

    @Test
    void failedRequestProductNumberNull() {
        vendingMachine.addCurrency(50);
        assertThrows(RuntimeException.class, () -> {
            vendingMachine.request(7).getInfo();
        });
    }

    @Test
    void endSession() {
    }

    @Test
    void getDescription() {
    }

    @Test
    void getBalance() {
    }

    @Test
    void getProducts() {
    }
}