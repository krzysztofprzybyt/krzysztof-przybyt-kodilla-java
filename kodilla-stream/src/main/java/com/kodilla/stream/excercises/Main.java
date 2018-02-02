package com.kodilla.stream.excercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static long getCountEmptyStringUsingJava8(List<String> strings){

        return strings.stream()
                .filter(d->d.isEmpty())
                .count();
    }
    public static long getCountLength3UsingJava8(List<String> strings){
        return strings.stream()
                .filter(d->d.length() ==3)
                .count();
    }
    public static List<String> deleteEmptyStringsUsingJava8(List<String> strings){

        return strings.stream()
                .filter(d->d.length()>0)
                .collect(Collectors.toList());
    }
    public static String getMergedStringUsingJava8(List<String> strings, String sign){

        return strings.stream()
                .filter(d->d.length()>0)
                .collect(Collectors.joining(sign));
    }
    public static List<Integer> getSquaresJava8(List<Integer> numbers){
        return numbers.stream()
                .distinct()
                .map(n->n*n)
                .collect(Collectors.toList());
    }

    public static Integer getMaxJava8(List<Integer> numbers){
        return numbers.stream()
                .mapToInt(m->m)
                .max().getAsInt();
    }

    public static Integer getMinJava8(List<Integer> numbers){
        return numbers.stream()
                .mapToInt(m->m)
                .min().getAsInt();
    }

    public static Integer getSumJava8(List<Integer> numbers){
        return numbers.stream()
                .mapToInt(m->m)
                .sum();
    }

    public static Integer getAverageJava8(List<Integer> numbers){
        double average = numbers.stream()
                .mapToLong(m->m)
                .average().getAsDouble();
        return (int)average;
    }

}
