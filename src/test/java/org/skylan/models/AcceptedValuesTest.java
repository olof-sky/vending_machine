package org.skylan.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcceptedValuesTest {

    @Test
    void getMoney() {
        int actual = AcceptedValues.TWOHUNDRED.getMoney();
        int excpected = 200;
        assertEquals(excpected, actual);
    }
}