package org.example.Animal;

import java.util.ArrayList;

public abstract class Animal
{
    private String name;
    private ArrayList<String> colours;
    private boolean male;
    private double weight;
    private int age;
    private String type;


    public Animal(String name, ArrayList<String> colours, boolean male, double weight, int age, String type)
    {
        this.name = name;
        this.colours = colours;
        this.male = male;
        this.weight = weight;
        this.age = age;
        this.type = type;
    }
    public void eat()
    {
        System.out.println("Animal.eat() called");
    }
    public void move(int speed)
    {

    }

    public String getName()
    {
        return name;
    }

    public ArrayList<String> getColours()
    {
        return colours;
    }

    public boolean isMale()
    {
        return male;
    }

    public double getWeight()
    {
        return weight;
    }

    public int getAge()
    {
        return age;
    }

    public String getType()
    {
        return type;
    }

}
