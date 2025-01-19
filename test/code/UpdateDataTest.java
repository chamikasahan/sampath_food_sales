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

/**
 *
 * @author sahan
 */
public class UpdateDataTest {

    public UpdateDataTest() {
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

    //add valid data and update
    @Test
    public void validUpdateData() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        java.util.Date javaDate = sdf.parse("02/07/2022");

        long j1 = javaDate.getTime();

        java.sql.Date date = new java.sql.Date(j1);
        UpdateData ud = new UpdateData(501, 112, 104, "Beef", 20, 10, javaDate, 200, "Polonnaruwa");
    }
    // add invalid data and update
    @Test 
    public void invalidUpdateData() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        java.util.Date javaDate = sdf.parse("02/07/2022");

        long j1 = javaDate.getTime();

        java.sql.Date date = new java.sql.Date(j1);
        UpdateData ud = new UpdateData(0, 0, 0, null, 0, 0, null, 0, null);
    }

}
