/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe2024;

import javax.swing.JOptionPane;


public class KanbanBoard {
    public static void main(String[] args) {
        // Welcome message, displayed using JOptionPane
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
////////////////////////////////////////////////////////////////

        // Get user information, user will input the required information
        String firstName = JOptionPane.showInputDialog(null, "Please enter your first name:");
        String lastName = JOptionPane.showInputDialog(null, "Please enter your last name:");
        String username = "";
        String password = "";

        boolean isValidUsername = false;
        boolean isValidPassword = false;
        ////////////////////////////////////////////////////////////////////////

        // Loop until valid username is entered
        // method will reiterate until a user name meets the defined requirements
        while (!isValidUsername) {
            username = JOptionPane.showInputDialog(null, "Please enter a username that is 5 characters long and contains an underscore:");
            isValidUsername = Login.checkUsername(username);
            if (!isValidUsername) {
                JOptionPane.showMessageDialog(null, "Invalid username format. Please try again.");
            }
        }
        ///////////////////////////////////////////////////////////////

        // Loop until valid password is entered
        // method reiterates until a valid password has been entered that meets the requirements
        while (!isValidPassword) {
            password = JOptionPane.showInputDialog(null, "Please enter a password that is 8 characters long, contains a capital letter, a special character, and a number:");
            isValidPassword = Login.checkPasswordComplexity(password);
            if (!isValidPassword) {
                JOptionPane.showMessageDialog(null, "Invalid password format. Please try again.");
            }
        }
        ////////////////////////////////////////////////////////////////////////////

        // Instance of user object
        User user = new User(firstName, lastName, username, password);

        // Create account
        Login login = new Login();
        login.createAccount(user);

        // Login
        if (login.loginUser(username, password)) {
            JOptionPane.showMessageDialog(null, "Login successful!");

            // Instance of the TaskManager class
            TaskManager taskManager = new TaskManager();

            // Start task management
            taskManager.startTaskManagement();
        } else {
            JOptionPane.showMessageDialog(null, "Login failed. Invalid credentials.");
        }
        ////////////////////////////////////////////////////////////////////
    }
}


