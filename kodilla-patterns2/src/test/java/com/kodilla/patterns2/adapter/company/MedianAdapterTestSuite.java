package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //Given
        Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> booksFromLibraryA= new HashSet<>();
        MedianAdapter adapterToCalculate = new MedianAdapter();
        booksFromLibraryA.add(new com.kodilla.patterns2.adapter.bookclasifier.librarya.Book("Steven","StevenTitle",1990,"1zjjdeiigo"));
        booksFromLibraryA.add(new com.kodilla.patterns2.adapter.bookclasifier.librarya.Book("Martin","MartinTitle",1991,"1zj453eiigo"));
        booksFromLibraryA.add(new com.kodilla.patterns2.adapter.bookclasifier.librarya.Book("John","JohnTitle",1992,"1zjjdeloioio"));
        booksFromLibraryA.add(new com.kodilla.patterns2.adapter.bookclasifier.librarya.Book("Tom","TomTitle",1993,"1zjjdezzsso"));
        booksFromLibraryA.add(new com.kodilla.patterns2.adapter.bookclasifier.librarya.Book("Martha","MarthaTitle",1996,"1zjjdezzsso"));
        booksFromLibraryA.add(new com.kodilla.patterns2.adapter.bookclasifier.librarya.Book("Ivonne","IvonneTitle",2000,"1zjjdezzsso"));
        //When
        int result = adapterToCalculate.publicationYearMedian(booksFromLibraryA);
        System.out.println(result);
        //Then
        assertEquals(1993,result);
    }
}
