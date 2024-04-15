/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package poe2024;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author nicholasphillips
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({poe2024.TaskTest.class, poe2024.POE2024Test.class, poe2024.TaskManagerTest.class, poe2024.KanbanBoardTest.class, poe2024.LoginTest.class, poe2024.UserTest.class})
public class Poe2024Suite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
