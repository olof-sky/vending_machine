package org.skylan.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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