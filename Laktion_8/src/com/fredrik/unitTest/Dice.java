package com.fredrik.unitTest;
import java.util.Random;

public class Dice {

    private int number;
    private Random rand = new Random();

    public Dice(){
        roll();
    }

    public void roll(){
        number = rand.nextInt(1,7);
    }

    public int getNumber() {
        return number;
    }
}
