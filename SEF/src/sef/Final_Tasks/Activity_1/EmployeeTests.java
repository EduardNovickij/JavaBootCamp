package sef.Final_Tasks.Activity_1;

import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class EmployeeTests extends TestCase {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    private Employee employee;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        employee = new Employee();
        System.setOut(new PrintStream(outContent));
    }

    @Override
    protected void tearDown() throws Exception {
        System.setOut(originalOut);
        super.tearDown();
    }

    public void testName(){
        //Check setName and getName
        employee.setName("Eduard");
        assertEquals("Eduard",employee.getName());
    }

    public void testJobTitle(){
        //Check setJobTitle and getJobTitle
        employee.setJobTitle("Intern");
        assertEquals("Intern",employee.getJobTitle());
    }

    public void testCompany(){
        //Check setCompany and getCompany
        employee.setCompany("Accenture");
        assertEquals("Accenture",employee.getCompany());
    }

    public void testAge(){
        //Check setAge and getAge
        employee.setAge(20);
        assertEquals(20,employee.getAge());
    }

    public void testSalary(){
        //check setSalary and getSalary
        employee.setSalary(500);
        assertEquals(500, employee.getSalary());
    }

    public void testIntroduce(){
        //Check Introduce function
        employee = new Employee("Eduard","Novickij","Intern","Accenture",20,500);
        employee.Introduce();
        assertEquals("My name is Eduard and I am 20 years old.I am work as Intern in Accenture (Salary: 500.0, Surname: Novickij)",outContent.toString().trim());
    }
}
