/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ui.LoginPage;

/**
 *
 * @author sahan
 */
public class AddNewDataTest {

    public AddNewDataTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void invalidInput() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        java.util.Date javaDate = sdf.parse("02/08/2022");

        long j1 = javaDate.getTime();

        java.sql.Date date = new java.sql.Date(j1);

        AddNewData ads = new AddNewData(0, 0, null, 0, 0, null, 50.0f, null);

    }

    //
    @Test // valid input test
    public void validInput() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        java.util.Date javaDate = sdf.parse("02/08/2022");

        long j1 = javaDate.getTime();

        java.sql.Date date = new java.sql.Date(j1);

        AddNewData ads = new AddNewData(1, 101, "Apple", 10, 5.0f, date, 50.0f, "East");

    }


}
