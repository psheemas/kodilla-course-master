package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<BoardRow> rows = new ArrayList<>();

    public Board() {
        for(int k=0;k<9;k++){
            rows.add(new BoardRow());
        }
    }
    public SudokuElement getElement(int col, int row){
        return rows.get(row).getCols().get(col);
    }

    public void setValue(int col, int row, int value){
        rows.get(row).getCols().get(col).setValue(value);
    }

    public void resolve(){
        boolean changed = true;
        while(changed){
            removePossiblesFromRow();
            removePossiblesFromCol();
            removePossiblesFromBox();
            changed = fillValuesForObsoletes();
        }

    }



    private void removePossiblesFromRow() {

    }

    private void removePossiblesFromCol() {

    }

    private void removePossiblesFromBox() {

    }

    private boolean fillValuesForObsoletes() {
        return false;
    }
}
