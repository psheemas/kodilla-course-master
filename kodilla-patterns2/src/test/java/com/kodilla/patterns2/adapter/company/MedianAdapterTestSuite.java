package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //Given
        Set<BookA> booksFromLibraryA= new HashSet<>();
        MedianAdapter adapterToCalculate = new MedianAdapter();
        booksFromLibraryA.add(new BookA("Steven","StevenTitle",1990,"1zjjdeiigo"));
        booksFromLibraryA.add(new BookA("Martin","MartinTitle",1991,"1zj453eiigo"));
        booksFromLibraryA.add(new BookA("John","JohnTitle",1992,"1zjjdeloioio"));
        booksFromLibraryA.add(new BookA("Tom","TomTitle",1993,"1zjjdezzsso"));
        booksFromLibraryA.add(new BookA("Martha","MarthaTitle",1996,"1zjjdezzsso"));
        booksFromLibraryA.add(new BookA("Ivonne","IvonneTitle",2000,"1zjjdezzsso"));
        //When
        int result = adapterToCalculate.publicationYearMedian(booksFromLibraryA);
        System.out.println(result);
        //Then
        assertEquals(1993,result);
    }
}
