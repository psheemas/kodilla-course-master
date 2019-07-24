package com.kodilla.stream.array;


import java.util.stream.*;

public interface ArrayOperations{
    static double getAverage(int[] numbers){
        if (numbers==null){
            System.out.println("error");
            return 0;
        }else{
            System.out.println("Numbers are: ");
            IntStream.range(0, numbers.length)
                    .map(n -> numbers[n])
                    .forEach(n -> System.out.print(n + " "));

            double average = IntStream.range(0, numbers.length)
                    .map(n -> numbers[n])
                    .average().orElse(Double.NaN);
            return average;
        }
    }
}