package org.skylan.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VendingMachineImplementationTest {

    VendingMachineImplementation vendingMachine;

    @BeforeEach
    void setUp(){
        vendingMachine = new VendingMachineImplementation();
    }

    @Test
    void addCurrency() {
        vendingMachine.addCurrency(5);
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