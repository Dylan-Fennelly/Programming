package org.example.Testing;

import java.util.ArrayList;

public class Calculator
{

    public double add(ArrayList<Double> numbersToAdd)
    {
        double result = 0;
        for(Double number:numbersToAdd)
        {
            result+=number;
        }
        return result;
    }
    public double subtract(ArrayList<Double> numbersToAdd)
    {
        double result = numbersToAdd.get(0);
        for(int i=1;i<numbersToAdd.size();i++)
        {
            result-= numbersToAdd.get(i);
        }
        return result;
    }
    public double mulitply(ArrayList<Double> numbersToAdd)
    {
        double result = numbersToAdd.get(0);
        for(int i=1;i<numbersToAdd.size();i++)
        {
            result *= numbersToAdd.get(i);
        }
        return result;

    }
    public double divide(ArrayList<Double> numbersToAdd)
    {
        double result = numbersToAdd.get(0);
        for(int i=1;i<numbersToAdd.size();i++)
        {
            result /= numbersToAdd.get(i);
        }
        return result;
    }
    public static double modulus(double num1 , double num2)
    {

        return num1%num2;
    }
}
