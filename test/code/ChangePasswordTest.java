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
public class ChangePasswordTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    public ChangePasswordTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testEmptyFields() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Fields are required !");
        ChangePassword changePassword = new ChangePassword("", "", "", "");
    }

    @Test
    public void testInvalidUsername() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Invalid Username");
        ChangePassword changePassword = new ChangePassword("invalidUser", "oldPassword", "newPassword123", "newPassword123");
    }

    @Test
    public void testIncorrectCurrentPassword() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Enter correct old Password");
        ChangePassword changePassword = new ChangePassword("test", "21321123", "11223344", "11223344");
    }

    @Test
    public void testPasswordMismatch() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("New password and Confirm Password Does not match");
        ChangePassword changePassword = new ChangePassword("test", "00998877", "12344321", "123456");
    }

    @Test
    public void testSuccessfulPasswordChange() {
        ChangePassword changePassword = new ChangePassword("test", "00998877", "22334455", "22334455");

    }

}
