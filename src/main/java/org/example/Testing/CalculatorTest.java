package org.example.Testing;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest
{
    @Test
     public void addTest1()
    {
        System.out.println("Test 1 - Add two +ve whole doubles");
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(10.0);
        numbers.add(7.0);
        numbers.add(4.0);
        double expResult = 21;
        Calculator calculator = new Calculator();
        assertEquals(expResult,calculator.add(numbers));
    }
    @Test
    public void subtract2postivenums()
    {
        System.out.println("Test 1 - Subtract 3+ve whole doubles");
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(10.0);
        numbers.add(3.0);
        numbers.add(4.0);
        double expResult = 3;
        Calculator calculator = new Calculator();
        assertEquals(expResult,calculator.subtract(numbers));
    }
    @Test
    public void multiply2nums()
    {
        System.out.println("Test");
    }

}