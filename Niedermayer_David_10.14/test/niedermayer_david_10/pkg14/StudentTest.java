/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package niedermayer_david_10.pkg14;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nidid
 */
public class StudentTest {
    
    private Student student;
    
    public StudentTest() {
    }
 
    @Before
    public void setUp() throws Exception{
      student = new Student(1234, "John Doe");
    }

    /**
     * Test of addGrade method, of class Student.
     */
    @Test
    public void testAddGrade() throws Exception {
        student.addGrade(4);
        ArrayList<Integer> grades = student.getGrades();
        assertTrue(grades.contains(4));

    }

    /**
     * Test of average method, of class Student.
     */
    @Test
    public void testAverage() throws Exception {
        student.addGrade(3);
        student.addGrade(5);
        assertEquals(4.0, student.average(), 0.001);

    }

    /**
     * Test of finalGrade method, of class Student.
     */
    @Test
    public void testFinalGrade() throws Exception {
        student.addGrade(5);
        student.addGrade(4);
        student.addGrade(4);
        student.addGrade(1);
        assertEquals(3, student.finalGrade());

    }
    
}
