/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

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
public class LoginFormTest {
    
    public LoginFormTest() {
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
    public void testLoginForm() {
        LoginPage ll = new LoginPage();
        LoginForm lf = new LoginForm("nimesha", "Employee", "2345678", ll);
    }
    
}
