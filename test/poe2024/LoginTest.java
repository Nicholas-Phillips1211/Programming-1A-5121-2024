/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package poe2024;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {

   //test for the login feature
   //login successful
    @Test
    public void testLoginUser_SuccessfulLogin() {
        System.out.println("Login Successful");
        String username = "kyl_1";
        String password = "Ch&&sec@ke99!";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginUser(username, password);
        assertEquals(expResult, result);
    }
    //////////////////////////////////////////////////////////////////
//login failed
    @Test
    public void testLoginUser_FailedLogin() {
        System.out.println("Login Failed");
        String username = "incorrect_user";
        String password = "incorrect_password";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginUser(username, password);
        assertEquals(expResult, result);
    }
    ///////////////////////////////////////////////////////////////

    //check username valid test
    //valid username
    @Test
    public void testCheckUsername_CorrectlyFormatted() {
        System.out.println("Username correctly formatted");
        String username = "kyl_1";
        boolean expResult = true;
        boolean result = Login.checkUsername(username);
        assertEquals(expResult, result);
    }
    ////////////////////////////////////////////////////////////
    //not valid username
    @Test
    public void testCheckUsername_IncorrectlyFormatted() {
        System.out.println("Username incorrectly formatted");
        String username = "kyle!!!!!!";
        boolean expResult = false;
        boolean result = Login.checkUsername(username);
        assertEquals(expResult, result);
    }
    //////////////////////////////////////////////////////////////

    //password complexity test
    @Test
    public void testCheckPasswordComplexity_PasswordMeetsRequirements() {
        System.out.println("Password meets complexity requirements");
        String password = "Ch&&sec@ke99!";
        boolean expResult = true;
        boolean result = Login.checkPasswordComplexity(password);
        assertEquals(expResult, result);
    }
    ////////////////////////////////////////////////////////////////
    
//password does not meet the requirements
    @Test
    public void testCheckPasswordComplexity_PasswordDoesNotMeetRequirements() {
        System.out.println("Password does not meet complexity requirements");
        String password = "password";
        boolean expResult = false;
        boolean result = Login.checkPasswordComplexity(password);
        assertEquals(expResult, result);
    }
    /////////////////////////////////////////////////////////////////////
}
