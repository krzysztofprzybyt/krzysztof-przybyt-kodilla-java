package com.kodilla.sudoku;

import java.util.HashSet;
import java.util.Set;

public class SudokuElement {
    public static int EMPTY = -1;

    static Set<Integer> elements = new HashSet<>();
    {
        elements.add(1);
        elements.add(2);
        elements.add(3);
        elements.add(4);
        elements.add(5);
        elements.add(6);
        elements.add(7);
        elements.add(8);
        elements.add(9);
    }
}
