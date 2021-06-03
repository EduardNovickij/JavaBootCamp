package sef.Final_Tasks.Activity_1;

import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StudentsTests extends TestCase {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    private Students student;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        student = new Students();
        System.setOut(new PrintStream(outContent));
    }

    @Override
    protected void tearDown() throws Exception {
        System.setOut(originalOut);
        super.tearDown();
    }

    public void testIntroduce(){
        //Check Introduce function
        student = new Students("Latvian University");
        student.Introduce();
        assertEquals("I am study in university Latvian University",outContent.toString().trim());
    }
}
