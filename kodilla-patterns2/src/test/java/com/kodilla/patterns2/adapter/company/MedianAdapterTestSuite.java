package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //Given
        Set<Book> booksFromLibraryA= new HashSet<>();
        MedianAdapter adapterToCalculate = new MedianAdapter();
        booksFromLibraryA.add(new Book("Steven","StevenTitle",1990,"1zjjdeiigo"));
        booksFromLibraryA.add(new Book("Martin","MartinTitle",1991,"1zj453eiigo"));
        booksFromLibraryA.add(new Book("John","JohnTitle",1992,"1zjjdeloioio"));
        booksFromLibraryA.add(new Book("Tom","TomTitle",1993,"1zjjdezzsso"));
        booksFromLibraryA.add(new Book("Martha","MarthaTitle",1996,"1zjjdezzsso"));
        booksFromLibraryA.add(new Book("Ivonne","IvonneTitle",2000,"1zjjdezzsso"));
        //When
        int result = adapterToCalculate.publicationYearMedian(booksFromLibraryA);
        System.out.println(result);
        //Then
        assertEquals(1993,result);
    }
}
