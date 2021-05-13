package org.skylan.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CiderTest {

    private Product cider = new Cider(2,30, "Apple cider", "330ml", "Apple", 150, "Plastic bottle");

    @BeforeEach
    void setUp(){
    }

    @Test
    void getInfo() {
        String expected = "2: Apple cider";
        String actual = cider.getInfo();
        assertEquals(expected, actual);
    }

    @Test
    void getPrice() {
        int expected = 30;
        int actual = cider.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    void getProductNumber() {
        int expected = 2;
        int actual = cider.getProductNumber();
        assertEquals(expected, actual);
    }

    @Test
    void examine() {
        String expected = "name: Apple cider / price: 30kr / size: 330ml / allergens: Apple / calories: 150 / packaging: Plastic bottle";
        String actual = cider.examine();
        assertEquals(expected, actual);
    }

    @Test
    void use() {
        String expected = "You bought Apple cider for 30kr";
        String actual = cider.use();
        assertEquals(expected, actual);
    }
}