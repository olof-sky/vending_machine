package org.skylan.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChocolateBarTest {

    private Product chocolate = new ChocolateBar(1,25, "Marabou apelsinkrokant", "250g", "Nuts", 1000, "Plastic wrap");

    @BeforeEach
    void setUp(){
    }

    @Test
    void getInfo() {
        String expected = "1: Marabou apelsinkrokant";
        String actual = chocolate.getInfo();
        assertEquals(expected, actual);
    }

    @Test
    void getPrice() {
        int expected = 25;
        int actual = chocolate.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    void getProductNumber() {
        int expected = 1;
        int actual = chocolate.getProductNumber();
        assertEquals(expected, actual);
    }

    @Test
    void examine() {
        String expected = "name: Marabou apelsinkrokant / price: 25kr / size: 250g / allergens: Nuts / calories: 1000 / packaging: Plastic wrap";
        String actual = chocolate.examine();
        assertEquals(expected, actual);
    }

    @Test
    void use() {
        String expected = "You bought Marabou apelsinkrokant for 25kr";
        String actual = chocolate.use();
        assertEquals(expected, actual);
    }
}