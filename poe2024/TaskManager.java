/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe2024;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    // list to store the tasks
    private List<Task> tasks;
    
    //constructor to start the list of tasks
    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void startTaskManagement() {
        while (true) {
            showMenu(); // Display menu and get user choice

            int choice = getChoice(); // gets the user choice

            switch (choice) {
                case 1:
                    addTask();// add a new task
                    break;
                case 2:
                    showTasks();// view exisitng tasks
                    break;
                case 3:
                    quit();// exits the application
                    return; 
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
            }
        }
    }

    //displays the menu using JOptionPane
    private void showMenu() {
        // layout of the menu
        StringBuilder menuBuilder = new StringBuilder();
        menuBuilder.append("Choose an option:\n");
        menuBuilder.append("1. Add a task\n");
        menuBuilder.append("2. View tasks\n");
        menuBuilder.append("3. Quit");

        JOptionPane.showMessageDialog(null, menuBuilder.toString(), "Menu", JOptionPane.PLAIN_MESSAGE);
    }

    // method to get user choice
    private int getChoice() {
        try {
            // prompt user for input and parse it to a interger
            String input = JOptionPane.showInputDialog(null, "Enter your choice (1-3):");
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
            return -1; // Invalid choice
        }
    }

    // method to add a new task
    private void addTask() {
        // creation of a new Task object
        Task task = new Task();
        // sets the attributes of the task based on the input provided by a user
        task.setTaskName(JOptionPane.showInputDialog(null, "Enter Task Name:"));
        task.setTaskDescription(JOptionPane.showInputDialog(null, "Enter Task Description:"));
        task.setDeveloperDetails(JOptionPane.showInputDialog(null, "Enter Developer Details (First Last):"));
        task.setTaskStatus(JOptionPane.showInputDialog(null, "Enter Task Status (To Do/Done/Doing):"));

        try {
            // displays the task duration input into a interger
            int duration = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Task Duration (hours):"));
            task.setTaskDuration(duration);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input for task duration. Using default value (0).");
        }

        // Generate task ID
        task.generateTaskID();

       // add a task to the list of tasks
        tasks.add(task);
         // displays a confirmation for the task being added successfully
        JOptionPane.showMessageDialog(null, "Task added successfully.\nTask ID: " + task.getTaskID());
    }

    // method to show details of a specific task
    private void showTasks() {
        // prompt user for task ID
        String taskIdInput = JOptionPane.showInputDialog(null, "Enter Task ID:");
        // a flag to indicate if the task has been found
        boolean taskFound = false;

        //searchs for the specifed task
        for (Task task : tasks) {
            if (task.getTaskID().equals(taskIdInput)) {
                JOptionPane.showMessageDialog(null, task.printTaskDetails(), "Task Details", JOptionPane.INFORMATION_MESSAGE);
                taskFound = true;
                break;
            }
        }
       
        // displays a error message if the id for the task has not been found
        if (!taskFound) {
            JOptionPane.showMessageDialog(null, "Task with ID " + taskIdInput + " not found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    //method that exits/ closes the application
    private void quit() {
        JOptionPane.showMessageDialog(null, "Exiting the application. Goodbye!");
    }
}
