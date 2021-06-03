package sef.Final_Tasks.Activity_1;

import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PersonTests extends TestCase {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    private Person person;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        person = new Person();
        System.setOut(new PrintStream(outContent));
    }

    @Override
    protected void tearDown() throws Exception {
        System.setOut(originalOut);
        super.tearDown();
    }

    public void testIntroduce(){
        //Check Introduce function
        person = new Person("Eduard","Novickij",20);
        person.Introduce();
        assertEquals("My name is Eduard and I am 20 years old",outContent.toString().trim());
    }

    public void testName(){
        //Check setName and getName without numbers
        person.setName("Eduard");
        assertEquals("Eduard",person.getName());

        //Check setName and getName with numbers
        person.setName("Eduard1");
        assertEquals("No numbers allowed in Persons name and/or surname",outContent.toString().trim());
        assertEquals("Eduard",person.getName());
    }

    public void testSurname(){
        //Check setSurname and getSurname without numbers
        person.setSurname("Novickij");
        assertEquals("Novickij",person.getSurname());

        //Check setSurname and getSurname with numbers
        person.setName("Novickij1");
        assertEquals("No numbers allowed in Persons name and/or surname",outContent.toString().trim());
        assertEquals("Novickij",person.getSurname());
    }

    public void testAge(){
        //Check setAge and getAge
        person.setAge(20);
        assertEquals(20,person.getAge());
    }
}
