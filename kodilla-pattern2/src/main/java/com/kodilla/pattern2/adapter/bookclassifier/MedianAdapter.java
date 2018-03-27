package com.kodilla.pattern2.adapter.bookclassifier;

import com.kodilla.pattern2.adapter.bookclassifier.librarya.Book;
import com.kodilla.pattern2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.pattern2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.pattern2.adapter.bookclassifier.libraryb.Book> books = new HashMap<>();
        BookSignature signature;
        for(Book book: bookSet) {
            signature = new BookSignature(book.getSignature());
            books.put(signature,
                    new com.kodilla.pattern2.adapter.bookclassifier.libraryb.Book(
                            book.getTitle(),
                            book.getAuthor(),
                            book.getPublicationYear()));
        }
        return medianPublicationYear(books);
    }

}
