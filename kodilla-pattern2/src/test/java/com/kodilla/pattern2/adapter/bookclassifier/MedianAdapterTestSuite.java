package com.kodilla.pattern2.adapter.bookclassifier;

import com.kodilla.pattern2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Henry Ford", "Yellow", 1999, "New"));
        bookSet.add(new Book("Alan Walker", "Green", 2011, "New"));
        bookSet.add(new Book("Henry Johanson", "Blue", 1989, "New"));
        bookSet.add(new Book("Henry Johanson", "White", 1983, "New"));
        bookSet.add(new Book("Steve Martin", "Black", 2000, "New"));
        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        int mediana = medianAdapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(1999, mediana);

    }
}
