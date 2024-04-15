/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe2024;

import java.util.HashMap;
import java.util.Map;

public class Login {

    // used to connect string usernames to user objects
    private Map<String, User> userDatabase;
    ////////////////////////////////

    // default constructor
    public Login() {
        // Initialize the user database
        userDatabase = new HashMap<>();
        // sample user
        userDatabase.put("kyl_1", new User("Nicholas", "Phillips", "kyl_1", "Ch&&sec@ke99"));
    }
    ///////////////////////////////////////////////////////

    // createAccount method
    // after usernames and passwords have been validated a user will be added to the database and a successful message will be displayed
    // if username or password do not meet the requirements a failure message will be displayed
    public void createAccount(User user) {
        boolean validUsername = checkUsername(user.getUsername());
        boolean validPassword = checkPasswordComplexity(user.getPassword());

        if (validUsername && validPassword) {
            // Add the user to the user database
            userDatabase.put(user.getUsername(), user);
            System.out.println("Welcome, " + user.getFirstName() + "! Your account has been created successfully.");
        } else {
            System.out.println("Invalid input. Account creation process failed.");
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////
    //loginUser method
    public boolean loginUser(String username, String password) {
        //checks if the username password is null or empty
        // if either are true it will return false
        if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
            return false;
        }
        //////////////////////////////////////////////////////////////
        
        // makes use of the userDatabase to authenticate users
        // if the username exisits in the database it checks the password against that user object
        //if username and password are true a successful authentication method will be displayed
        // if any of the parameters are incorrect it will return false
        if (userDatabase.containsKey(username)) {
            User user = userDatabase.get(username);
            if (user.getPassword().equals(password)) {
                return true; // Authentication successful
            }
        }
        return false;
        /////////////////////////////////////////////////////////////////
    }
    //checks if the username contains a underscore and the length of the word is five characters
    public static boolean checkUsername(String username) {
        return username.length() == 5 && username.contains("_");
    }
    //////////////////////////////////////////////////////////////////////////////////////
    // check password complexity validates the password and makes sure the password meets the requirements
    // string pattern ensures that the password contains at least one digit, at least one uppercase letter, one special character, no spaces and that the sting length is 8
    public static boolean checkPasswordComplexity(String password) {
        String pattern = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";
        return password.matches(pattern);
    }
    ///////////////////////////////////////////////////////////////////////////
}
