package com.kodilla.jdbc;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;

public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException{
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        //When
        String sqlProcedureCall = "Call UpdateVipLevels()";
        statement.execute(sqlProcedureCall);
        //Then
        String sqlChekTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL =\"Not set\"";
        ResultSet rs = statement.executeQuery(sqlChekTable);
        int howMany = -1;
        if(rs.next()){
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0,howMany);

    }
    @Test
    public void testUpdateBestsellers() throws SQLException{
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE books set bestseller = 0";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        //When
        String sqlProcedureCall = "Call UpdateBestSellers()";
        statement.execute(sqlProcedureCall);
        //Then
        String sqlCheckTable = "select Count(*) as how_many from books where bestseller = 0";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if(rs.next()){
            howMany = rs.getInt("how_many");
        }
        assertEquals(0,howMany);
    }

}
