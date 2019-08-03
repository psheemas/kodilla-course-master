package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<BookA> bookASet) {
        Map<BookSignature, Book> booksFromLibraryA = new HashMap<>();

        bookASet.stream()
                .forEach(n->booksFromLibraryA.put
                        (new BookSignature(n.getSignature()),new Book(n.getAuthor(),n.getTitle(),n.getPublicationTear())));
         return medianPublicationYear(booksFromLibraryA);
    }
}
