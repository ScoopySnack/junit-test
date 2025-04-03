package gr.aueb.cf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LoginValidatorTest {

    @Test
    void isValidLogin() {
        assertTrue(LoginValidator.isValidLogin("admin", "1234"), "Login should succeed for valid credentials.");
    }

    @Test
    void testInvalidUsername() {
        // Test invalid username with valid password
        assertFalse(LoginValidator.isValidLogin("wrongUser", "1234"), "Login should fail for incorrect username.");
    }

    @Test
    void testInvalidPassword() {
        // Test valid username with invalid password
        assertFalse(LoginValidator.isValidLogin("admin", "wrongPass"), "Login should fail for incorrect password.");
    }

    @Test
    void testEmptyFields() {
        // Test empty username and password
        assertFalse(LoginValidator.isValidLogin("", ""), "Login should fail for empty credentials.");
    }
}