package org.skylan.sequencer;

public class ProductNumberSequencer {
    private static int id;

    public static int getNextId(){
        return id++;
    }
}
