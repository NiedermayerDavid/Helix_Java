/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package niedermayer_david_10.pkg14;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nidid
 */
public class StudentGroupTest {
    
    private StudentGroup group;
    private Student student1;
    private Student student2;
    
    public StudentGroupTest() {
    }
    
    @Before
    public void setUp() throws Exception {
        group = new StudentGroup();
        student1 = new Student(1234, "John Doe");
        student2 = new Student(5678, "Jane Doe");

        student1.addGrade(1);
        student2.addGrade(5);
    }

    /**
     * Test of addStudent method, of class StudentGroup.
     */
    @Test
    public void testAddStudent() throws Exception {
        group.addStudent(student1);
        assertEquals(1, group.students.size());
    }

    /**
     * Test of removeStudent method, of class StudentGroup.
     */
    @Test
    public void testRemoveStudent() throws Exception {
        group.addStudent(student1);
        group.removeStudent(student1);
        assertEquals(0, group.students.size());
    }

    /**
     * Test of groupAverage method, of class StudentGroup.
     */
    @Test
    public void testGroupAverage() throws Exception {
        group.addStudent(student1);
        group.addStudent(student2);
        assertEquals(3, group.groupAverage(), 0.001);
    }

    /**
     * Test of isFailing method, of class StudentGroup.
     */
    @Test
    public void testIsFailing() throws Exception {
        group.addStudent(student1);
        student1.addGrade(1); // Bukásra áll
        assertTrue(group.isFailing());
    }
    
}
