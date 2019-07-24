package com.kodilla.rps;

import java.util.Random;

public class RpsRandom {
    public int generateRandom() {
    Random randomGenerator = new Random();
    int randomNum = randomGenerator.nextInt(5);
    return randomNum;
    }
}
