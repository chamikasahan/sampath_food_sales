/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author sahan
 */
public class RegisterFormTest {
     @Rule
    public ExpectedException thrown = ExpectedException.none();
    public RegisterFormTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testValidRegistration() {
        RegisterForm registerForm = new RegisterForm("chamikaaaSa", "chamikaaaSa@gmail.com", 1, "22334455", "22334455","employee",null, false);
        assertEquals("User Registered Successfully", registerForm.registerStatus);
    }

    @Test
    public void testEmptyFields() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("All fields are required");
        RegisterForm registerForm = new RegisterForm("", "", 0, "", "","",null, false);
        
    }

    @Test
    public void testInvalidEmail() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Enter a valid email");
        RegisterForm registerForm = new RegisterForm("chamikaSa2", "chamikaSa22@saad", 1, "22334455", "22334455","employee",null, false);
    }

    @Test
    public void testShortPassword() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Password should be more than 6 characters");

        RegisterForm registerForm = new RegisterForm("chamikaSa2", "chamikaSa22@gmail.com", 1, "123", "123","employee",null, false);
    }

    @Test
    public void testMismatchedPasswords() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Password does not match");

        RegisterForm registerForm = new RegisterForm("chamikaSa2", "chamikaSa22@gmail.com", 1, "1221343", "1231123","employee",null, false);
    }

    @Test
    public void testDuplicateUsername() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Username already exists");
        RegisterForm registerForm = new RegisterForm("chamika", "chamika@gmail.com", 1, "11223344", "11223344","admin",null, false);
    }
    
}
