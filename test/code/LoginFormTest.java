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
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import ui.LoginPage;

/**
 *
 * @author sahan
 */
public class LoginFormTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

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
    public void testEmptyLogin() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("All fields are required");

        LoginPage loginPage = new LoginPage();
        new LoginForm("", "", "", loginPage);
    }

    @Test
    public void testInvalidLogin() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Invalid Username, Password, or Role");

        LoginPage loginPage = new LoginPage();
        LoginForm loginForm = new LoginForm("invalidUser", "", "wrongPassword", loginPage);

    }

    @Test
    public void testValidAdminLogin() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Admin Login Successful");

        LoginPage loginPage = new LoginPage();
        LoginForm loginForm = new LoginForm("chamika", "Admin", "11223344", loginPage);

    }

    @Test
    public void testValidEmployeeLogin() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Employee Login Successful");

        LoginPage loginPage = new LoginPage();
        LoginForm loginForm = new LoginForm("test", "Employee", "12341234", loginPage);

    }

    @Test
    public void testPartialInput() {

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("All fields are required");

        LoginPage loginPage = new LoginPage();
        new LoginForm("partialUser", "Admin", "", loginPage);

    }
}
