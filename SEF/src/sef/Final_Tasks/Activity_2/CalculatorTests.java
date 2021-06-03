package sef.Final_Tasks.Activity_2;

import junit.framework.TestCase;

public class CalculatorTests extends TestCase{
    private Calculator calc;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        calc = new Calculator();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testAdd(){
        //Check sum of two positive numbers
        assertEquals(10,calc.Add(3,7));
        assertEquals(10,calc.Add(7,3));

        //Check sum of positive and negative numbers
        assertEquals(-4,calc.Add(3,-7));
        assertEquals(-4,calc.Add(-7,3));
        assertEquals(4,calc.Add(-3,7));
        assertEquals(4,calc.Add(7,-3));

        //Check sum of two negative numbers
        assertEquals(-10,calc.Add(-3,-7));
        assertEquals(-10,calc.Add(-7,-3));
    }

    public void testSubtract(){
        //Check difference of two positive numbers
        assertEquals(4,calc.Subtract(3,7));
        assertEquals(4,calc.Subtract(7,3));

        //Check difference of positive and negative numbers
        assertEquals(-10,calc.Subtract(-3,7));
        assertEquals(-10,calc.Subtract(-7,3));
        assertEquals(10,calc.Subtract(3,-7));
        assertEquals(10,calc.Subtract(7,-3));

        //Check difference of two negative numbers
        assertEquals(4,calc.Subtract(-3,-7));
        assertEquals(-4,calc.Subtract(-7,-3));
    }

    public void testMultiply(){
        //Check multiplication of two positive numbers
        assertEquals(21,calc.Multiply(3,7));
        assertEquals(21,calc.Multiply(7,3));

        //Check multiplication of positive and negative numbers
        assertEquals(-21,calc.Multiply(3,-7));
        assertEquals(-21,calc.Multiply(-7,3));
        assertEquals(-21,calc.Multiply(-3,7));
        assertEquals(-21,calc.Multiply(7,-3));

        //Check multiplication of two negative numbers
        assertEquals(21,calc.Multiply(-3,-7));
        assertEquals(21,calc.Multiply(-7,-3));

        //Check multiplication with zero
        assertEquals(0,calc.Multiply(0,7));
        assertEquals(0,calc.Multiply(7,0));
    }

    public void testDivide(){
        //Check division with two positive numbers
        assertEquals(0.5,calc.Divide(3,6));
        assertEquals(2,calc.Divide(6,3));

        //Check division with positive and negative numbers
        assertEquals(-0.5,calc.Divide(-3,6));
        assertEquals(-2,calc.Divide(6,-3));
        assertEquals(-0.5,calc.Divide(3,-6));
        assertEquals(-2,calc.Divide(-6,3));

        //Check division with two negative numbers
        assertEquals(0.5,calc.Divide(-3,-6));
        assertEquals(2,calc.Divide(-6,-3));

        //Check division with zero
        assertEquals(0,calc.Divide(3,0));
        assertEquals(0,calc.Divide(0,3));
    }
}
