package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> booksFromLibraryA = new HashMap<>();

        bookSet.stream()
                .forEach(n->booksFromLibraryA.put
                        (new BookSignature(n.getSignature()),new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(n.getAuthor(),n.getTitle(),n.getPublicationTear())));
         return medianPublicationYear(booksFromLibraryA);
    }
}
