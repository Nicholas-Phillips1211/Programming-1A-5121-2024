/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package poe2024;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nicholasphillips
 */
public class TaskTest {
    
    public TaskTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setTaskName method, of class Task.
     */
    @Test
    public void testSetTaskName() {
        System.out.println("setTaskName");
        String taskName = "";
        Task instance = new Task();
        instance.setTaskName(taskName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaskDescription method, of class Task.
     */
    @Test
    public void testSetTaskDescription() {
        System.out.println("setTaskDescription");
        String taskDescription = "";
        Task instance = new Task();
        instance.setTaskDescription(taskDescription);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeveloperDetails method, of class Task.
     */
    @Test
    public void testSetDeveloperDetails() {
        System.out.println("setDeveloperDetails");
        String developerDetails = "";
        Task instance = new Task();
        instance.setDeveloperDetails(developerDetails);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaskDuration method, of class Task.
     */
    @Test
    public void testSetTaskDuration() {
        System.out.println("setTaskDuration");
        int taskDuration = 0;
        Task instance = new Task();
        instance.setTaskDuration(taskDuration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaskStatus method, of class Task.
     */
    @Test
    public void testSetTaskStatus() {
        System.out.println("setTaskStatus");
        String taskStatus = "";
        Task instance = new Task();
        instance.setTaskStatus(taskStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateTaskID method, of class Task.
     */
    @Test
    public void testGenerateTaskID() {
        System.out.println("generateTaskID");
        Task instance = new Task();
        instance.generateTaskID();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskID method, of class Task.
     */
    @Test
    public void testGetTaskID() {
        System.out.println("getTaskID");
        Task instance = new Task();
        String expResult = "";
        String result = instance.getTaskID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printTaskDetails method, of class Task.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        Task instance = new Task();
        String expResult = "";
        String result = instance.printTaskDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
