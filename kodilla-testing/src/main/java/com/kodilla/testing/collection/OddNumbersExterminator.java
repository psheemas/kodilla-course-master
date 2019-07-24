package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {
    private ArrayList<Integer> numbers;
    private ArrayList<Integer> oddNumbers;

    /*public OddNumbersExterminator(ArrayList<Integer> numbers){
        this.numbers = numbers;
    }
    */

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        oddNumbers = new ArrayList<Integer>();
        for (Integer oddNum : numbers) {
            if (oddNum % 2 == 0) {
                oddNumbers.add(oddNum);
            }
        }
        return oddNumbers;
    }
}