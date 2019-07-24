package com.kodilla.sudoku;


import org.junit.Before;
import org.junit.Test;

public class BoardTestSuite {
    private Board board;

    @Before
    public void setUp(){
        board = new Board();
        board.setValue(3,0,2);
        board.setValue(3,0,2);
        board.setValue(3,0,2);
        board.setValue(3,0,2);
        board.setValue(3,0,2);
        board.setValue(3,0,2);
        board.setValue(3,0,2);
    }

    @Test
    public void testResolve(){
        //Given
        //When
        board.resolve();
        //Then
        //sprawdzic czy pola zostaly uzupelnione
    }

}