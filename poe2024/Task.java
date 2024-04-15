/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe2024;

public class Task {
    // keeps track of the number of tasks created
    private static int taskCounter = 1;
    
    // task attributes
    private int taskNumber;
    private String taskName;
    private String taskDescription;
    private String developerDetails;
    private int taskDuration;
    private String taskStatus;
    private String taskID;
    ///////////////////////////////////////////////
    

    // constructor to create an instance of a task and assign a unique task number
    public Task() {
        this.taskNumber = taskCounter++;
    }
    ////////////////////////////////////////////
    
    //Setter methods for the attributes of the tasks
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setDeveloperDetails(String developerDetails) {
        this.developerDetails = developerDetails;
    }

    public void setTaskDuration(int taskDuration) {
        this.taskDuration = taskDuration;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }
    /////////////////////////////////////////////////////////////////////
    
    //method to generate a unique task ID for each generated task
    public void generateTaskID() {
    // takes the first two letters of the task name and capitalizes the letters
    String formattedTaskName = taskName.substring(0, 2).toUpperCase();
    
    // takes the last name of the developer details and capitalizes it
    String lastName = developerDetails.substring(developerDetails.lastIndexOf(" ") + 1);
    
    //determins the start index for the last 3 letters
    int startIndex = Math.max(0, lastName.length() - 3);
    
    // takes the last 3 letters of the last name and capitalizes it
    String lastThreeLetters = lastName.substring(startIndex).toUpperCase();
    
    // creates the desired format for the generated ID
    this.taskID = formattedTaskName + ":" + taskNumber + ":" + lastThreeLetters;
}
/////////////////////////////////////////////////////////////////////////////////////

    // getter method to retrieve the task ID
    public String getTaskID() {
        return taskID;
    }
    /////////////////////////////////////////////////////
    
    //method to print the task details
    public String printTaskDetails() {
        return "Task ID: " + taskID +
                "\nTask Name: " + taskName +
                "\nTask Description: " + taskDescription +
                "\nDeveloper Details: " + developerDetails +
                "\nTask Duration: " + taskDuration +
                "\nTask Status: " + taskStatus;
    }
    ///////////////////////////////////////////////////////////
}
