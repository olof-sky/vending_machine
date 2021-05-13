package org.skylan.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FruitTest {
    private Product pear = new Fruit(3,7, "Pear", "100g", 60);

    @BeforeEach
    void setUp(){
    }

    @Test
    void getInfo() {
        String expected = "3: Pear";
        String actual = pear.getInfo();
        assertEquals(expected, actual);
    }

    @Test
    void getPrice() {
        int expected = 7;
        int actual = pear.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    void getProductNumber() {
        int expected = 3;
        int actual = pear.getProductNumber();
        assertEquals(expected, actual);
    }

    @Test
    void examine() {
        String expected = "name: Pear / price: 7kr / size: 100g / calories: 60";
        String actual = pear.examine();
        assertEquals(expected, actual);
    }

    @Test
    void use() {
        String expected = "You bought Pear for 7kr";
        String actual = pear.use();
        assertEquals(expected, actual);
    }
}