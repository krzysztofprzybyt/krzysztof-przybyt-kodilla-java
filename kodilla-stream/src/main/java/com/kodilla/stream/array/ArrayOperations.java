package com.kodilla.stream.array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers){
        int[] list = numbers;

        IntStream.range(0, list.length)
                .map(n -> list[n])
                .forEach(System.out::println);

        double average = IntStream.range(0, list.length)
                .map(n -> list[n])
                .average()
                .getAsDouble();

        return average;
    }

}
