package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.Collectors;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        Library library = new Library("Strange Books");

        Book book1 = new Book("Amarok", "Christopher King", LocalDate.of(2001,12,11));
        Book book2 = new Book("Bedinroom", "Leon Jankis", LocalDate.of(1999,4,20));
        Book book3 = new Book("Curries", "Steven Proen", LocalDate.of(2010,7,2));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //making a shallow copy of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Strange Books 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedLibraty = null;
        try {
            deepClonedLibraty = library.deepCopy();
            deepClonedLibraty.setName("Strange Books 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When

        library.getBooks().remove(book3);

        //Then

        System.out.println(library.getName()+ " - how many books: "+library.getBooks().size());
        System.out.println(clonedLibrary.getName()+ " - how many books: "+clonedLibrary.getBooks().size());
        System.out.println(deepClonedLibraty.getName()+ " - how many books: "+deepClonedLibraty.getBooks().size());


        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibraty.getBooks().size());

    }
}
